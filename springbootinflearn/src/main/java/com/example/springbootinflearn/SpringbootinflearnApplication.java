package com.example.springbootinflearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ex.Holoman;

@SpringBootApplication
public class SpringbootinflearnApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringbootinflearnApplication.class, args);
		
		SpringApplication application = new SpringApplication(SpringbootinflearnApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
	}
	
//	@Bean
//	public Holoman holoman() {
//		Holoman holoman = new Holoman();
//		holoman.setName("tt");
//		holoman.setHowLong(60);
//		return holoman;
//	}
 
}
