package org.andot.share.common.utils;

import org.andot.share.common.domain.JwtUserDetail;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.DefaultClaims;
import io.jsonwebtoken.impl.DefaultJwtBuilder;

import java.util.*;

/**
 * Jwt 工具类
 * @author lucas
 */
public class JwtUtil {

    /**
     * 去掉Token的固定头 <code>Bearer </code>
     * @param authorization
     * @return
     */
    public static String getTokenByHeader(String authorization){
        return Optional.ofNullable(authorization).map(token->token.replace("Bearer ", "")).orElse("");
    }

    /**
     * 生成jwt token
     * @param userDetail
     * @param secret
     * @param expiration
     * @return
     */
    public static String productJwtToken(JwtUserDetail userDetail, String secret, Long expiration){
        JwtBuilder jwtBuilder = new DefaultJwtBuilder().signWith(SignatureAlgorithm.HS256, secret);
        return jwtBuilder.setExpiration(new Date(System.currentTimeMillis()+expiration*1000))
                .setId(userDetail.getXNumber())
                .setIssuer("ipsos.cn")
                .setIssuedAt(Calendar.getInstance().getTime())
                .claim("username", userDetail.getUsername())
                .claim("roles", userDetail.getRoles()).compact();
    }

    /**
     * 释放token中的对象
     * @param token
     * @param secret
     * @return
     */
    public static JwtUserDetail releaseJwtToken(String token, String secret){
        Claims claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
        JwtUserDetail jwtUserDetail = new JwtUserDetail();
        jwtUserDetail.setXNumber(claims.getId());
        jwtUserDetail.setUsername(claims.get("username").toString());
        jwtUserDetail.setRoles((List<String>)claims.get("roles"));
        return jwtUserDetail;
    }


    public static boolean isTokenExpired(String token, String secret){
        Claims claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
        Date date = claims.getExpiration();
        return date.before(new Date());
    }

}
