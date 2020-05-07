package org.andot.share.api.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.andot.share.api.dao.RoleMapper;
import org.andot.share.api.dao.RoleUserMapper;
import org.andot.share.api.dao.UserDetailMapper;
import org.andot.share.api.dao.UserMapper;
import org.andot.share.api.dto.RoleDto;
import org.andot.share.api.dto.UserDto;
import org.andot.share.api.entity.Role;
import org.andot.share.api.entity.RoleUser;
import org.andot.share.api.entity.User;
import org.andot.share.api.entity.UserDetail;
import org.andot.share.api.dto.XUserDetail;
import org.andot.share.api.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@AllArgsConstructor
@Service("userService")
public class UserServiceImpl implements UserService, UserDetailsService {

    private final UserMapper userMapper;
    private final UserDetailMapper userDeatilMapper;
    private final RoleUserMapper roleUserMapper;
    private final RoleMapper roleMapper;
    private final PasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String xNumber) {
        try {
            UserDto user = this.getUser(xNumber);
            List<RoleUser> roleUserList = roleUserMapper.selectList(new LambdaQueryWrapper<RoleUser>().eq(RoleUser::getXNumber, xNumber));
            List<Long> roleIds = roleUserList.stream().map(RoleUser::getRoleId).collect(Collectors.toList());
            List<RoleDto> roles = roleMapper.selectBatchIds(roleIds).stream().map(item-> RoleDto.builder()
                    .roleCode(item.getRoleCode()).roleId(item.getRoleId())
                    .roleName(item.getRoleName()).roleType(item.getRoleType()).build()).collect(Collectors.toList());
            return new XUserDetail(user, roles);
        }catch (Exception ex){
            log.error("考虑用户编号恶意攻击问题，"+ex.getMessage());
            throw new UsernameNotFoundException("用户编号传输错误");
        }
    }

    @Override
    public UserDetail getUserDetail(Long xNumber) {
        return userDeatilMapper.selectOne(new LambdaQueryWrapper<UserDetail>().eq(UserDetail::getXNumber, xNumber));
    }

    @Override
    public UserDto getUser(Long xNumber) {
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userMapper.selectOne(new LambdaQueryWrapper<User>().eq(User::getXNumber, xNumber)), userDto);
        return userDto;
    }

    @Override
    public UserDto getUser(String phone) {
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userMapper.selectOne(new LambdaQueryWrapper<User>().eq(User::getPhone, phone)), userDto);
        return userDto;
    }

    @Override
    public XUserDetail login(String number, String password) {
        User user = userMapper.selectOne(new LambdaQueryWrapper<User>().eq(User::getPhone, number).or().eq(User::getXNumber, number));
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(user, userDto);
        if(bCryptPasswordEncoder.matches(password, user.getPassword())){
            List<RoleUser> roleUserList = roleUserMapper.selectList(new LambdaQueryWrapper<RoleUser>().eq(RoleUser::getXNumber, user.getXNumber()));
            List<Long> roleIds = roleUserList.stream().map(RoleUser::getRoleId).collect(Collectors.toList());
            List<RoleDto> roles = new ArrayList<>();
            if(roleIds.size() != 0){
                roles = roleMapper.selectList(new LambdaQueryWrapper<Role>().in(Role::getRoleId, roleIds))
                        .stream().map(item-> RoleDto.builder()
                        .roleCode(item.getRoleCode()).roleId(item.getRoleId())
                        .roleName(item.getRoleName()).roleType(item.getRoleType()).build()).collect(Collectors.toList());
            }
            return new XUserDetail(userDto, roles);
        }else{
            throw new UsernameNotFoundException("用戶密碼錯誤");
        }
    }
}
