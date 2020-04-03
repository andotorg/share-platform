package org.andot.share.api.component.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.ServletException;

@ResponseStatus(code = HttpStatus.NON_AUTHORITATIVE_INFORMATION)
public class AuthorizationServletException extends ServletException {
    public AuthorizationServletException(String message) {
        super(message);
    }
}
