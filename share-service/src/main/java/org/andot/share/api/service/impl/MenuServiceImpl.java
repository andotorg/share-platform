package org.andot.share.api.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import lombok.AllArgsConstructor;
import org.andot.share.api.dao.MenuMapper;
import org.andot.share.api.dto.MenuDto;
import org.andot.share.api.entity.Menu;
import org.andot.share.api.service.MenuService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service("menuService")
public class MenuServiceImpl implements MenuService {

    private final MenuMapper menuMapper;

    @Override
    public Menu getMenuById(Long roleId) {
        return menuMapper.selectById(roleId);
    }

    @Override
    public List<Menu> getMenuList(String menuName, String url) {
        return menuMapper.selectList(new LambdaQueryWrapper<Menu>().like(Menu::getMenuName, menuName).or().like(Menu::getMenuUrl, url));
    }

    @Override
    public boolean saveMenu(MenuDto menuDto) {
        Menu menu = new Menu();
        BeanUtils.copyProperties(menuDto, menu);
        return menuMapper.insert(menu)>0;
    }

    @Override
    public boolean updateMenu(MenuDto menuDto) {
        Menu menu = new Menu();
        BeanUtils.copyProperties(menuDto, menu);
        return menuMapper.updateById(menu)>0;
    }

    @Override
    public boolean delMenuById(Long id) {
        return menuMapper.deleteById(id)>0;
    }
}
