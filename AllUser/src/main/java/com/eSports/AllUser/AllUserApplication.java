package com.eSports.AllUser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AllUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(AllUserApplication.class, args);
	}

}
