package org.andot.share.api.controller;

import io.swagger.annotations.Api;
import org.andot.share.api.dto.ActionDto;
import org.andot.share.api.dto.OrganDto;
import org.andot.share.api.dto.PageDto;
import org.andot.share.common.response.CommonPage;
import org.andot.share.common.response.CommonResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/***
 * 组织机构控制器
 * @author andot
 * @date 2019-1-17 16:03:09
 * @since 1.0
 */
@Api(tags = "组织机构控制器", description = "组织机构控制器")
@RequestMapping("/organ")
public class OrganController extends BaseController {

    @PostMapping("")
    public CommonResult add(@RequestBody OrganDto organDto){
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
    public CommonResult getList(OrganDto organDto) {
        return null;
    }

    @PostMapping("/table")
    public CommonPage getPageList(@RequestBody PageDto<OrganDto> organPage) {
        return null;
    }
}
