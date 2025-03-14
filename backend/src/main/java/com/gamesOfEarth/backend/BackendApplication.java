package com.gamesOfEarth.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/user-login").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("/get-events").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("/create-user").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("/log-out").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("/getUser").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("/isLogged").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("/get-user-events").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("/get-sports").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("/get-event-types").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("/get-all-features").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("/event-players/{id}").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("/player-add/{id}").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("/add-playersFees/{id}").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("/add-team").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("").allowedOrigins("http://localhost:3000").allowCredentials(true);
				registry.addMapping("").allowedOrigins("http://localhost:3000").allowCredentials(true);
			}
		};
	}
}
