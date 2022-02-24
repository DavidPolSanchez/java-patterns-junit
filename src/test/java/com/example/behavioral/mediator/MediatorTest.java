package com.example.behavioral.mediator;

import com.example.behavioral.command.demo.mediator.AbstractUser;
import com.example.behavioral.command.demo.mediator.ChatMediator;
import com.example.behavioral.command.demo.mediator.Telegram;
import com.example.behavioral.command.demo.mediator.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("MediatorTest: Test para la clase ChatMediator")
public class MediatorTest {

        @Test
        @DisplayName("Test del patrón Mediator")
        void chatTest() throws IOException {
            ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
            System.setOut(new PrintStream(byteOutput));
            ChatMediator chat = new Telegram();

            AbstractUser user = new User(chat, "Juan");

            user.send("Hola buenas!");
            byteOutput.flush();
            String allWrittenLines = byteOutput.toString();
            assertTrue(allWrittenLines.contains("sent!"));
        }
}
