package org.andot.share.api.controller;

import io.swagger.annotations.Api;
import org.andot.share.api.component.ShareValueComponent;
import org.andot.share.api.domain.RoleDto;
import org.andot.share.api.domain.XUserDetail;
import org.andot.share.api.domain.request.LoginParam;
import org.andot.share.api.service.UserService;
import org.andot.share.common.domain.AccessToken;
import org.andot.share.common.domain.JwtUserDetail;
import org.andot.share.common.response.CommonResult;
import org.andot.share.common.utils.JwtUtil;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.stream.Collectors;

/**
 * @author Andot
 */
@Api(tags = "公共API", description = "操作方法请求控制器")
@RestController
public class CommonController {

    @Resource
    private UserService userService;
    @Resource
    private ShareValueComponent shareValueComponent;

    @PostMapping("/login")
    public CommonResult login(@RequestBody LoginParam loginParam,
                              HttpServletRequest request){
        XUserDetail userDetail = userService.login(loginParam.getNumber(), loginParam.getPassword());
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetail.getUsername(), userDetail.getPassword(), userDetail.getAuthorities());
        authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        AccessToken accessToken = new AccessToken();
        accessToken.setPrefix("Bearer");
        JwtUserDetail jwtUserDetail = new JwtUserDetail();
        jwtUserDetail.setRoles(userDetail.getRoleList().stream().map(RoleDto::getRoleCode).collect(Collectors.toList()));
        jwtUserDetail.setUsername(userDetail.getUser().getPhone());
        jwtUserDetail.setXNumber(userDetail.getUsername());
        String token = JwtUtil.productJwtToken(jwtUserDetail, shareValueComponent.getJwtSecret(), shareValueComponent.getJwtExpiration());
        accessToken.setToken(token);
        return CommonResult.success(accessToken, "登录成功");
    }
}
