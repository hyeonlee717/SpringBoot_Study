package com.apple.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        Test test = new Test();

        test.setName("kim");
        test.setAge(20);
        test.settingAge(101);
        test.oneMore();

        String currentName = test.getName();
        Integer currentAge = test.getAge();


        return "이름 : " + currentName + ", 나이 : " + currentAge;
    }

}
