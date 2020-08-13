package com.simplify.sample.db.controller;

import com.simplify.sample.db.dto.memberVO;
import com.simplify.sample.db.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Member;
import java.util.logging.Level;

@Controller
@AllArgsConstructor
public class LoginController {

    @Autowired
    TestService testService;

    @GetMapping("/")
    public String firstview() {
        return "login/logining.html";
    }

    @GetMapping("/newMember")
    public String goToMemberRegister() {
        return "login/registerMember.html";
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String test(@RequestParam String id, @RequestParam String pass,Model model) throws Exception {
        return "boaed/list.html";
    }


    //Requestbody 사용하지 않아도 되는가 ?
    @RequestMapping(value="/register", method = RequestMethod.POST)
    public String register(@RequestParam String id, @RequestParam String pass,Model model) throws Exception {

        System.out.println(id);
        System.out.println(pass);
        memberVO mv = new memberVO(id,pass);

        testService.insertMain(mv);
       /* model.addAttribute("meaage", id);*/
        return "login/logining.html";
    }
}
