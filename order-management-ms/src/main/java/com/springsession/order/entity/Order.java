package com.springsession.order.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {
	private Long id;
	private String name;
	private Float amount;
}