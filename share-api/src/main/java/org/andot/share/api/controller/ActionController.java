package org.andot.share.api.controller;

import io.swagger.annotations.Api;
import org.andot.share.api.dto.ActionDto;
import org.andot.share.api.dto.PageDto;
import org.andot.share.common.response.CommonPage;
import org.andot.share.common.response.CommonResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/***
 * @author lucas
 */
@Api(tags = "操作方法控制器", description = "操作方法请求控制器")
@RequestMapping("/action")
public class ActionController extends BaseController {

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
    public CommonResult getList(ActionDto actionDto) {
        return null;
    }

    @PostMapping("/table")
    public CommonPage getPageList(@RequestBody PageDto<ActionDto> actionPage) {
        return null;
    }
}
