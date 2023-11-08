package com.codeid.eshopee.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String showIndex(Model model) {
        List<String> pl = Arrays.asList("Java", "VB", "Go");
        model.addAttribute("title", "java");
        model.addAttribute("pl", pl);
        return "index";
    }

}
