package com.Sony;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SonyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SonyApplication.class, args);
	}

}
