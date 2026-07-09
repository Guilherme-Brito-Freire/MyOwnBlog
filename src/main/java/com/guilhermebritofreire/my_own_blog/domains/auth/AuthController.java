package com.guilhermebritofreire.my_own_blog.domains.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {
    @GetMapping("/login")
    public String loginPage(){
        return "pages/login";
    }
}
