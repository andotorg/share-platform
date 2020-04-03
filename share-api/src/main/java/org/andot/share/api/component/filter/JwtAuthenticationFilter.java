package org.andot.share.api.component.filter;

import lombok.extern.slf4j.Slf4j;
import org.andot.share.api.component.ShareValueComponent;
import org.andot.share.api.component.exception.TokenErrorServletException;
import org.andot.share.api.service.impl.UserServiceImpl;
import org.andot.share.common.domain.JwtUserDetail;
import org.andot.share.common.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.annotation.Resource;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.stream.Collectors;

/**
 * jwt 认证过滤器
 * @author lucas
 */
@Slf4j
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    @Autowired
    private ShareValueComponent shareValueComponent;
    @Resource
    private UserServiceImpl userService;


    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        String token = JwtUtil.getTokenByHeader(httpServletRequest.getHeader("Authorization"));
        if("".equals(token)){
            log.error("token 为空，请求接口请携带token");
        }else{
            if(JwtUtil.isTokenExpired(token, shareValueComponent.getJwtSecret())){
                throw new TokenErrorServletException("登录信息已经失效，请重新登录");
            }
            JwtUserDetail jwtUserDetail = JwtUtil.releaseJwtToken(token, shareValueComponent.getJwtSecret());
            UserDetails userDetail = userService.loadUserByUsername(jwtUserDetail.getXNumber());
            if(jwtUserDetail.getXNumber() != null && userDetail != null){
                UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetail,
                        null, jwtUserDetail.getRoles().stream().map(item->new SimpleGrantedAuthority("ROLE_"+item)).collect(Collectors.toList()));
                authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(httpServletRequest));
                SecurityContextHolder.getContext().setAuthentication(authenticationToken);
            }
        }
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}
