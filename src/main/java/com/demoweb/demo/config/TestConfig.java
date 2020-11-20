package com.demoweb.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.demoweb.demo.entities.User;
import com.demoweb.demo.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "16997503293", "112233445");
		User u2 = new User(null, "Alex Green", "Alex@gmail.com", "16981121964", "998877665");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
