package com.example.thymeleaf_wordle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WordleGuiController {

    @GetMapping
    String test(Model model){
        model.addAttribute("test","Wordle");
        return "WordleGui";
    }

}
