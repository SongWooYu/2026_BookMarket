package kr.pile.dy.bookmarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
    @GetMapping("/home")
    public String welcomeMethod() {
        return "welcome";
    }
}
