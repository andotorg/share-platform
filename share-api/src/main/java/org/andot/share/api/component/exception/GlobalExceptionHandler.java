package org.andot.share.api.component.exception;

import lombok.extern.slf4j.Slf4j;
import org.andot.share.common.response.CommonResult;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public CommonResult formValidateFailed(MissingServletRequestParameterException e){
        log.error("ParameterError:{}", e.getMessage());
        return CommonResult.failed("参数错误");
    }

    @ExceptionHandler(AccessDeniedException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public CommonResult processAccessDeniedException(AccessDeniedException e) {
        return CommonResult.forbidden();
    }

    @ExceptionHandler(AuthorizationServletException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NON_AUTHORITATIVE_INFORMATION)
    public CommonResult tokenNotFount(AuthorizationServletException e) {
        return CommonResult.failed(e.getMessage());
    }

    @ExceptionHandler(TokenErrorServletException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.PROXY_AUTHENTICATION_REQUIRED)
    public CommonResult tokenNotFount(TokenErrorServletException e) {
        return CommonResult.failed(e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public CommonResult serverError(Exception ex){
        return CommonResult.failed(ex.getMessage());
    }
}
