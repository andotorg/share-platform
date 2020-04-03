package org.andot.share.api.component.utils;

import org.andot.share.api.dto.XUserDetail;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class CurrentUserUtil {
    public static String getUserCode(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        XUserDetail securityUserDetail = (XUserDetail)authentication.getPrincipal();
        return securityUserDetail.getUsername();
    }
}
