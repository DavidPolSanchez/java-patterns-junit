package com.example.behavioral.state;

public interface OrderState {

	void next(Order order);
	
	void previous(Order order);
}
