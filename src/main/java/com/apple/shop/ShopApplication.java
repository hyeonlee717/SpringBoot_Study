package com.apple.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);

		var test = new Friend("lee", 20);
		System.out.println(test.name);
		System.out.println(test.age);
	}

}

class Friend {
	String name;
	int age;
	Friend(String a, int b){
		this.name = a;
		this.age = b;
	}
}