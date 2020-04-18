package org.andot.share.api.controller;

import io.swagger.annotations.Api;
import org.andot.share.api.dto.MenuDto;
import org.andot.share.api.dto.PageDto;
import org.andot.share.common.response.CommonPage;
import org.andot.share.common.response.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/***
 * @author lucas
 */
@Api(tags = "菜单控制器", description = "菜单请求控制器")
@RequestMapping("/menu")
public class MenuController extends BaseController {

    @PostMapping("")
    public CommonResult add(@RequestBody MenuDto menuDto){
        return null;
    }

    @Override
    public CommonResult update(Long id) {
        return null;
    }

    @Override
    public CommonResult del(Long id) {
        return null;
    }

    @Override
    public CommonResult dels(List<Long> ids) {
        return null;
    }

    @Override
    public CommonResult get(Long id) {
        return null;
    }

    @GetMapping("/list")
    public CommonResult getList(MenuDto menuDto) {
        return null;
    }

    @PostMapping("/table")
    public CommonPage getPageList(@RequestBody PageDto<MenuDto> menuPage) {
        return null;
    }
}