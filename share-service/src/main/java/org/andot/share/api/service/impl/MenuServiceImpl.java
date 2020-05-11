package org.andot.share.api.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import lombok.AllArgsConstructor;
import org.andot.share.api.dao.MenuMapper;
import org.andot.share.api.dto.MenuDto;
import org.andot.share.api.entity.AnMenu;
import org.andot.share.api.service.MenuService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Service("menuService")
public class MenuServiceImpl implements MenuService {

    private final MenuMapper menuMapper;


    @Override
    public List<AnMenu> getMenuList(String menuName, String url) {
        return menuMapper.selectList(new LambdaQueryWrapper<AnMenu>().like(AnMenu::getMenuName, menuName).or().like(AnMenu::getMenuUrl, url));
    }

    @Transactional
    @Override
    public boolean saveMenu(MenuDto menuDto) {
        AnMenu anMenu = new AnMenu();
        BeanUtils.copyProperties(menuDto, anMenu);
        return menuMapper.insert(anMenu)>0;
    }

    @Transactional
    @Override
    public boolean updateMenu(Long id, MenuDto menuDto) {
        AnMenu anMenu = new AnMenu();
        BeanUtils.copyProperties(menuDto, anMenu);
        anMenu.setMenuId(id);
        return menuMapper.updateById(anMenu)>0;
    }

    @Transactional
    @Override
    public boolean delMenuById(Long id) {
        return menuMapper.deleteById(id)>0;
    }

    @Transactional
    @Override
    public boolean delBatchMenuById(List<Long> id) {
        for (int i = 0; i < id.size(); i++) {
            this.delMenuById(id.get(i));
        }
        return true;
    }

    @Override
    public MenuDto getMenuInfoById(Long menuId) {
        AnMenu menu = menuMapper.selectById(menuId);
        MenuDto menuDto = new MenuDto();
        BeanUtils.copyProperties(menu, menuDto);
        return menuDto;
    }

}
