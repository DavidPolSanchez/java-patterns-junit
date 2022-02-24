package com.example.behavioral.stateCustomized;

public class ProcessingState implements OrderState {

	@Override
	public String next(Order order) {

		String response =String.format("Updating Order %d from %s to %s.",
				order.getId(),
				this.getClass().getSimpleName(),
				ShippedState.class.getSimpleName()
			);
		
		System.out.println(response);
		
		order.setState(new ShippedState());
		return response;

	}

	@Override
	public String previous(Order order) {

		System.out.println("Root state");
		return "Root state";
	}

}
