package org.andot.share.api.component.filter;

import org.andot.share.common.response.CommonResult;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 处理corss 安全过滤器
 */
@Component
public class CORSSecurityFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse res = (HttpServletResponse) servletResponse;
        res.setHeader("Access-Control-Allow-Origin", "*");
        res.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
        res.setHeader("Access-Control-Max-Age", "1728000");
        res.setHeader("Access-Control-Allow-Headers", "Origin, No-Cache,X_Requested_With, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With, Authorization");
        res.setHeader("Access-Control-Allow-Credentials", "true");
        res.setHeader("XDomainRequestAllowed", "1");
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        if(HttpMethod.OPTIONS.toString().equals(request.getMethod())){
            res.setStatus(HttpStatus.METHOD_NOT_ALLOWED.value());
            servletResponse.getWriter().print(CommonResult.uni(HttpStatus.METHOD_NOT_ALLOWED.value(), "请求方式错误").toJsonString());
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
