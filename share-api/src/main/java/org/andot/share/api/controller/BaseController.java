package org.andot.share.api.controller;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/***
 * 基础控制器，减少控制器样板代码的编写
 * @author lucas
 * @param <T>
 */
public class BaseController<T> {
    @Autowired
    HttpServletRequest request;

}
