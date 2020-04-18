package org.andot.share.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.andot.share.api.dto.PageDto;
import org.andot.share.api.dto.RoleDto;
import org.andot.share.common.response.CommonPage;
import org.andot.share.common.response.CommonResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "角色API", description = "角色API")
@RequestMapping("/role")
@RestController
public class RoleController {

    @ApiOperation("更新数据")
    @PutMapping("/{id}")
    public CommonResult update(Long id) {
        return null;
    }

    @ApiOperation("删除数据")
    @DeleteMapping("/{id}")
    public CommonResult del(Long id) {
        return null;
    }

    @ApiOperation("批量删除数据")
    @DeleteMapping("/dels")
    public CommonResult dels(@RequestBody List<Long> ids) {
        return null;
    }

    @ApiOperation("根据id获取数据")
    @GetMapping("/{id}")
    public CommonResult get(Long id) {
        return null;
    }

    @ApiOperation("根据条件获取列表数据")
    @GetMapping("/list")
    public CommonResult getList(RoleDto roleDto) {
        return null;
    }

    @ApiOperation("根据条件获取分页列表数据")
    @PostMapping("/table")
    public CommonPage getPageList(@RequestBody PageDto<RoleDto> rolePage) {
        return null;
    }
}
