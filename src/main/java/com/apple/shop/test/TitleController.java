package com.apple.shop.test;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TitleController {

    private final TitleRepository titleRepository;

    @GetMapping("/title")
    String title(Model model) {

        List<Title> result = titleRepository.findAll();
        model.addAttribute("titles", result);

        return "title.html";
    }
}