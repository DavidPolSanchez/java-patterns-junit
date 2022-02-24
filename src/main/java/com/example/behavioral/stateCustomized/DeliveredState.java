package com.example.behavioral.stateCustomized;

public class DeliveredState implements OrderState {

	@Override
	public String next(Order order) {
		System.out.println("Order delivered, ends!");
		return "Order delivered, ends!";

	}

	@Override
	public String previous(Order order) {
		String mensaje=String.format("Updating Order %d from %s to %s.",
				order.getId(),
				this.getClass().getSimpleName(),
				ShippedState.class.getSimpleName()
		);
		System.out.println(mensaje
				);
		
		order.setState(new ShippedState());
		return String.format("Updating Order %d from %s to %s.",
				order.getId(),
				this.getClass().getSimpleName(),
				ShippedState.class.getSimpleName()
		);
	}

}
