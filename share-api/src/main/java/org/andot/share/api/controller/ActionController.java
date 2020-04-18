package org.andot.share.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.andot.share.api.dto.ActionDto;
import org.andot.share.api.dto.PageDto;
import org.andot.share.common.response.CommonPage;
import org.andot.share.common.response.CommonResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/***
 * @author lucas
 */
@Api(tags = "操作方法API", description = "操作方法请求控制器")
@RequestMapping("/action")
@RestController
public class ActionController {

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

    @GetMapping("/list")
    public CommonResult getList(ActionDto actionDto) {
        return null;
    }

    @PostMapping("/table")
    public CommonPage getPageList(@RequestBody PageDto<ActionDto> actionPage) {
        return null;
    }
}
