package org.andot.share.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.andot.share.api.dto.MenuDto;
import org.andot.share.api.dto.PageDto;
import org.andot.share.common.response.CommonPage;
import org.andot.share.common.response.CommonResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/***
 * @author lucas
 */
@Api(tags = "菜单API", description = "菜单请求控制器")
@RequestMapping("/menu")
@RestController
public class MenuController {

    @PostMapping("")
    public CommonResult add(@RequestBody MenuDto menuDto){
        return null;
    }

    @ApiOperation("更新数据")
    @PutMapping("/{id}")
    public CommonResult update(Long id) {
        return null;
    }

    @ApiOperation("删除数据")
    @GetMapping("/{id}")
    public CommonResult del(Long id) {
        return null;
    }

    @ApiOperation("批量删除数据")
    @GetMapping("/dels")
    public CommonResult dels(List<Long> ids) {
        return null;
    }

    @ApiOperation("根据id获取数据")
    @GetMapping("/{id}")
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