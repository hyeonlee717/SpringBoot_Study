package com.apple.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class BasicController {

    @GetMapping("/")
    @ResponseBody
    String hello() {
        return "hello";
    }

    @GetMapping("/about")
    @ResponseBody
    String about() {
        return "fake site";
    }

    @GetMapping("/date")
    @ResponseBody
    String date() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }

    @GetMapping("/mypage")
    String myPage() {
        return "index.html";
    }
}
