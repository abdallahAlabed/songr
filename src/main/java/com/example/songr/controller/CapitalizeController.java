package com.example.songr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CapitalizeController {

    @GetMapping("/capitalize/{word}")
    public String getCapitalize(Model model, @PathVariable String word){
        model.addAttribute("word",word.toUpperCase());
        return "Capitalize.html";
    }
}
