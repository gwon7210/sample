package com.simplify.sample.db.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class BoardController {

    @GetMapping("/gotoContent")
    public String gotocontent()throws Exception{
        return "board/makecontent";
    }

    @PostMapping("/insertContent")
    public String insertcontent(@RequestParam String title,@RequestParam String content,@RequestParam int delpass, HttpServletRequest req) throws Exception{
        HttpSession session = req.getSession();
        String id = (String)session.getAttribute("userid");

        return "board/makecontent";
    }
}
