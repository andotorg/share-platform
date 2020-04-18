package org.andot.share.api.controller;

import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.andot.share.common.response.CommonPage;
import org.andot.share.common.response.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/***
 * 基础控制器，减少控制器样板代码的编写
 * @author lucas
 */
@RestController
public abstract class BaseController {

    @Autowired
    HttpServletRequest request;

    @ApiOperation("更新数据")
    @PutMapping("/{id}")
    public abstract CommonResult update(@PathVariable("id") Long id);

    @ApiOperation("删除数据")
    @GetMapping("/{id}")
    public abstract CommonResult del(@PathVariable("id") Long id);

    @ApiOperation("批量删除数据")
    @GetMapping("/dels")
    public abstract CommonResult dels(@RequestBody List<Long> ids);

    @ApiOperation("根据id获取数据")
    @GetMapping("/{id}")
    public abstract CommonResult get(@PathVariable("id") Long id);
}
