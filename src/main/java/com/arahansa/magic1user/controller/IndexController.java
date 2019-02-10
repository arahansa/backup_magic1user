package com.arahansa.magic1user.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * @author Lucas Choi
 */
@Slf4j
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(String name, Model model){
        log.debug("name : {}", name);
        model.addAttribute("name", name);
        return "index";
    }

}
