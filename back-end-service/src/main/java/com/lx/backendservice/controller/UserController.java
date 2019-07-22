package com.lx.backendservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @program: bigdata-conosle
 * @description: 用户管理
 * @author: chenyulong
 * @create: 2019-07-22 09:54
 **/
@Slf4j
@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserController {

    /**
     * 用户登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 操作结果
     */
    @PostMapping(value = "/login", params = {"username", "password"})
    public String login(String username, String password) {
        System.out.println("-----------------");
        return "login ok " + username + password + new Date();
    }
}
