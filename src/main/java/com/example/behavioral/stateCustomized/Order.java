package com.example.behavioral.stateCustomized;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
	
	// atributos
	private Long id;
	private LocalDateTime date;
	private List<Product> products = new ArrayList<>();
	private OrderState state; //= new ProcessingState(); // State
	
	
	// constructores
	public Order(Long id, LocalDateTime date,OrderState state) {
		super();
		this.id = id;
		this.date = date;
		this.state=state;
	}

	public Order() {
	}

	// custom logic (comportamiento)
	public String nextState(){
		return state.next(this);
	}
	
	public String previousState()  {
		return state.previous(this);
	}
	
	
	
	
	// getter setter
	public Long getId() {
		return id;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public List<Product> getProducts() {
		return products;
	}
	public OrderState getState() {
		return state;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public void setState(OrderState state) {
		this.state = state;
	}

}
