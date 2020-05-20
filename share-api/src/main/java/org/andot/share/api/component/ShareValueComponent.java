package org.andot.share.api.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Andot
 */
@Component("shareValueComponent")
public class ShareValueComponent {
    @Value("${share.info}")
    private String info;
    @Value("${share.jwt.secret}")
    private String jwtSecret;
    @Value("${share.jwt.expiration}")
    private Long jwtExpiration;

    public String getInfo() {
        return info;
    }

    public String getJwtSecret() {
        return jwtSecret;
    }

    public Long getJwtExpiration() {
        return jwtExpiration;
    }
}
