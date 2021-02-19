package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
    
    private static final String DYNAMIC = "/dynamic";
    private static final String HOME = "/home";


    @RequestMapping(HOME)
    public String home() {
        return "HOME";
    }

    @RequestMapping(DYNAMIC)
    public String dynamic(Model model) {
        model.addAttribute("dateTime", "2020-02-19");
        return "dynamic";
    }
}
