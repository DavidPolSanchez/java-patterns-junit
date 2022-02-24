package com.example.behavioral.command.demo.invoker;


import com.example.behavioral.command.demo.commands.Command;

/**
 * Remote Control for Home automation where it will accept the command and
 * execute. This is the invoker in terms of command pattern terminology
 */
public class HomeAutomationRemote {

    //Command Holder
    Command command;

    //Set the command in runtime to trigger.
    public void setCommand(Command command) {
        this.command = command;
    }

    //Will call the command interface method so that particular command can be invoked.
    public void buttonPressed() {
        command.execute();
    }
}