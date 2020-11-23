package com.demoweb.demo.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.demoweb.demo.entities.Order;
import com.demoweb.demo.entities.User;
import com.demoweb.demo.entities.enums.OrderStatus;
import com.demoweb.demo.repositories.OrderRepository;
import com.demoweb.demo.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "16997503293", "112233445");
		User u2 = new User(null, "Alex Green", "Alex@gmail.com", "16981121964", "998877665");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.PAID ,u1);
		Order o2 = new Order(null, Instant.parse("2018-10-23T22:07:33Z"),OrderStatus.SHIPPED,u2);
		Order o3 = new Order(null, Instant.parse("2016-12-26T08:44:10Z"),OrderStatus.WAITING_PAYMENT,u1);
		
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
}
