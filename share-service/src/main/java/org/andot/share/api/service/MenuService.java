package org.andot.share.api.service;

import org.andot.share.api.dto.MenuDto;
import org.andot.share.api.entity.Menu;

import java.util.List;

/**
 * 菜单服务接口
 * 用于菜单创建、修改、删除、查询、分配角色
 * @author lucas
 * @date 2020-4-18
 * @since 1.0
 */
public interface MenuService {

    Menu getMenuById(Long roleId);

    List<Menu> getMenuList(String menuName, String url);

    boolean saveMenu(MenuDto menuDto);

    boolean updateMenu(MenuDto menuDto);

    boolean delMenuById(Long id);
}
