package com.sovon9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EsportsPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsportsPortalApplication.class, args);
	}

}
