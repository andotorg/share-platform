package org.andot.share.api.component.filter;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * 字符编码处理过滤器
 * @author lucas
 */
@Slf4j
@Component
public class CharsetConvertFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.error("start charset convert filter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletResponse.setCharacterEncoding("UTF-8");
        servletRequest.setCharacterEncoding("UTF-8");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        log.error("end charset convert filter");
    }
}
