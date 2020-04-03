package org.andot.share.api.component.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.ServletException;

@ResponseStatus(code = HttpStatus.PROXY_AUTHENTICATION_REQUIRED)
public class TokenErrorServletException extends ServletException {
    public TokenErrorServletException(String message) {
        super(message);
    }
}
