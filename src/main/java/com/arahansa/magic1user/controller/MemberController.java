package com.arahansa.magic1user.controller;

import com.arahansa.magic1user.domain.Member;
import com.arahansa.magic1user.service.MemberService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/member")
public class MemberController {

    List<Member> memberList = new ArrayList<>();

    @Autowired
    MemberService service;

    @GetMapping
    public String form(Model model){
        log.debug("member page..");
        model.addAttribute("member", new Member());
        model.addAttribute("list", service.findAll());
        return "member/member_create";
    }

    @PostMapping
    public String create(@Valid Member member, BindingResult bindingResult, Model model){
        log.debug("member : {}", member);
        if(bindingResult.hasErrors()){
            model.addAttribute("member", member);
            return "member/member_create";
        }
        service.save(member);
        return "redirect:/member";
    }
}
