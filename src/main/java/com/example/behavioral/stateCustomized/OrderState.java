package com.example.behavioral.stateCustomized;

public interface OrderState {

	String next(Order order);
	
	String previous(Order order);
}
