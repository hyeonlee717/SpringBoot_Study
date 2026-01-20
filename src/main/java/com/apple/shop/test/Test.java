package com.apple.shop.test;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Test {
    private String name;
    private Integer age;

    public void oneMore() {
        this.age = this.age + 1;
    }

    public void settingAge(Integer age) {
        if (age > 100 || age < 0) {
            System.out.println("error");
        }
        this.age = age;
    }
}