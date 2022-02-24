package com.example.behavioral.stateCustomized;

import java.time.LocalDateTime;

public class Main {
	
	public static void main(String[] args) {
		
		Order order = new Order(1L, LocalDateTime.now(),new ProcessingState());
		
		order.nextState();
		order.nextState();
		order.previousState();
		order.previousState();
		order.nextState();
		order.nextState();
	}

}
