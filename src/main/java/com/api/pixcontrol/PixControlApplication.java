package com.api.pixcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PixControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(PixControlApplication.class, args);
	}
}
