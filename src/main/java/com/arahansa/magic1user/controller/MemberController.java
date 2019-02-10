package com.arahansa.magic1user.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/member")
public class MemberController {

    @GetMapping
    public String form(){
        log.debug("member page..");
        return "member/member_create";
    }

    @PostMapping
    public String create(String username, String password, Model model){
        log.debug("username : {}, password", username, password);
        return "member/member_create";
    }
}
