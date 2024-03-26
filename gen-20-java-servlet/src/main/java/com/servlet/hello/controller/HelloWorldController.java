package com.servlet.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HelloWorldController {

    @GetMapping
    public String HelloWorld (Model model){
        String messeges = "Hello World passing dengan tyhmeleaf";
        model.addAttribute("msg", messeges);
        return "index";
    }


}
