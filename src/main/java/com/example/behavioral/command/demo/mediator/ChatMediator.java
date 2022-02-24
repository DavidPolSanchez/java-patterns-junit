package com.example.behavioral.command.demo.mediator;

public interface ChatMediator {

    public void sendMessage(String message, AbstractUser user);

    public void addUser(AbstractUser user);

    public void removeUser(AbstractUser user);
}
