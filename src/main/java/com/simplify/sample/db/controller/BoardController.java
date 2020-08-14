package com.simplify.sample.db.controller;

import com.simplify.sample.db.dto.contentVO;
import com.simplify.sample.db.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class BoardController {
    TestService testService;

    @GetMapping("/gotoContent")
    public String gotocontent()throws Exception{
        return "board/makecontent";
    }

    @PostMapping("/insertContent")
    public String insertcontent(@RequestParam String title, @RequestParam String content, @RequestParam Integer delpass, HttpServletRequest req) throws Exception{
        HttpSession session = req.getSession();
        String userid = (String)session.getAttribute("userid");
        System.out.println(title);
        System.out.println(content);
        System.out.println(delpass);
        contentVO con = new contentVO(title,content,userid,delpass);
        testService.insertContent(con);
        return "board/makecontent";
    }
}
