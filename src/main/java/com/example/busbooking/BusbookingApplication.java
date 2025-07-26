package com.example.busbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(
		exclude = {
				DataSourceAutoConfiguration.class,
				WebMvcAutoConfiguration.class,
				SecurityAutoConfiguration.class
		}
)
public class BusbookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusbookingApplication.class, args);
	}
}
