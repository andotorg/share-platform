package org.andot.share.api.service.impl;

import org.andot.share.api.entity.Menu;
import org.andot.share.api.service.MenuService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("menuService")
public class MenuServiceImpl implements MenuService {
    @Override
    public Menu getMenuById(Long roleId) {
        return null;
    }

    @Override
    public List<Menu> getMenuList(String menuName, String url) {
        return null;
    }

    @Override
    public boolean saveMenu(Menu role) {
        return false;
    }

    @Override
    public boolean updateMenu(Menu role) {
        return false;
    }

    @Override
    public boolean delMenuById(Long id) {
        return false;
    }
}
