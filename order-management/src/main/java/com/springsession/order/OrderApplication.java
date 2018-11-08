package com.springsession.order;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springsession.order.entity.Order;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class OrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	@GetMapping("/orders")
	public List<Order> getOrders() {

		return Arrays.asList(new Order(1L, "David Cohen", 25.4F), 
							 new Order(2L, "Danny Smith", 30.3F), 
							 new Order(3L, "Jerry Richardson", 40F));

	}
}
