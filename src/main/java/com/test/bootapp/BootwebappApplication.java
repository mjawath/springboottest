package com.test.bootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@EnableAutoConfiguration
public class BootwebappApplication extends SpringBootServletInitializer {


	@RequestMapping("/")
	String home() {
		System.out.println("trying jsp");
		return "hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(BootwebappApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		System.out.println("system out ");
		return application.sources(BootwebappApplication.class);
	}


}
