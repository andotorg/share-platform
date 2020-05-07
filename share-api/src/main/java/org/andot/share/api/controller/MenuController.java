package org.andot.share.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.andot.share.api.dto.MenuDto;
import org.andot.share.api.dto.PageDto;
import org.andot.share.api.service.MenuService;
import org.andot.share.common.response.CommonPage;
import org.andot.share.common.response.CommonResult;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/***
 * @author lucas
 */
@Api(tags = "菜单API", description = "菜单请求控制器")
@RequestMapping("/menu")
@RestController
public class MenuController {

    @Resource
    private MenuService menuService;

    @PostMapping("")
    public CommonResult add(@RequestBody MenuDto menuDto){
        menuService.saveMenu(menuDto);
        return null;
    }

    @ApiOperation("更新数据")
    @PutMapping("/{id}")
    public CommonResult update(@PathVariable("id") Long id) {
        return null;
    }

    @ApiOperation("删除数据")
    @DeleteMapping("/{id}")
    public CommonResult del(@PathVariable("id") Long id) {
        return null;
    }

    @ApiOperation("批量删除数据")
    @DeleteMapping("/dels")
    public CommonResult dels(@RequestBody List<Long> ids) {
        return null;
    }

    @ApiOperation("根据id获取数据")
    @GetMapping("/{id}")
    public CommonResult get(@PathVariable("id") Long id) {
        return null;
    }

    @ApiOperation("根据条件获取列表数据")
    @GetMapping("/list")
    public CommonResult getList(MenuDto menuDto) {
        return null;
    }

    @ApiOperation("根据条件获取分页列表数据")
    @PostMapping("/table")
    public CommonPage getPageList(@RequestBody PageDto<MenuDto> menuPage) {
        return null;
    }
}