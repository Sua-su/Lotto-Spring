package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public String login() {
        // TODO: 로그인 기능을 구현해주세요.
        return "login";
    }

    @PostMapping("/signup")
    public String signup() {
        // TODO: 회원가입 기능을 구현해주세요.
        return "signup";
    }
}
