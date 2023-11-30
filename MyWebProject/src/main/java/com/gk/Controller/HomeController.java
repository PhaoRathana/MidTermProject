package com.gk.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String homepage(){
        return "index";
    }
    @GetMapping("/about")
    public String about(){
        return "about";
    }
    @GetMapping("/cart")
    public String Cart(){
        return "cart";
    }
    @GetMapping("/shop")
    public String Shop(){
        return "shop";
    }

}
