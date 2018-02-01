package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class MainController {


    @RequestMapping("/loadform")
    public String LoadformPage() {
        return "formresume";
    }

    @RequestMapping("/processform")
    public String loadFromPage(@RequestParam("resume") String resume, Model model) {
        model.addAttribute("resumeval", resume);

        return "confirm";
    }
}
