package com.example.expenceApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ExpenceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenceAppApplication.class, args);
		
		
		
	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
		    //https://expence-front-end.herokuapp.com/
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("https://expence-front-end.herokuapp.com");
			}
		};
	}
}
