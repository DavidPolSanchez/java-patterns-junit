package com.example.behavioral.stateCustomized;

public class ShippedState implements OrderState {

	@Override
	public String next(Order order) {
		String response =String.format("Updating Order %d from %s to %s.",
				order.getId(),
				this.getClass().getSimpleName(),
				DeliveredState.class.getSimpleName()
		);
		System.out.println(response);
		
		order.setState(new DeliveredState());
		return response;
	}

	@Override
	public String previous(Order order) {

		String response =String.format("Updating Order %d from %s to %s.",
				order.getId(),
				this.getClass().getSimpleName(),
				ProcessingState.class.getSimpleName()
		);
		
		System.out.println(response);
		
		order.setState(new ProcessingState());

		return response;
	}

}
