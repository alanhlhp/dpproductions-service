package com.dpproductions.dpproductions;

import com.dpproductions.dpproductions.beans.User;
import com.dpproductions.dpproductions.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class DpproductionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DpproductionsApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository userRepository) {
		return args -> {
			Stream.of("Alan", "Daniel", "Admin", "Guest").forEach(user -> {
				User newUser = new User();
				newUser.setName(user);
				newUser.setUserName(user);
				userRepository.save(newUser);
			});
			userRepository.findAll().forEach(System.out::println);
		};
	}

}
