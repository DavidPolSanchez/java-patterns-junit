package com.example.behavioral.command.demo.mediator;

public class User extends AbstractUser{

	public User(ChatMediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void send(String message) {

		this.mediator.sendMessage(message, this);
		System.out.println("sent!");
	}

	@Override
	public void receive(String message) {
		System.out.println("received!");
		
	}

}
