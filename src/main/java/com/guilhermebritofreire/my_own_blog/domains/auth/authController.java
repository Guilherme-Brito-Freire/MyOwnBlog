package com.guilhermebritofreire.my_own_blog.domains.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class authController {
    @GetMapping("/login")
    public String login(){
        return "pages/login";
    }
}
