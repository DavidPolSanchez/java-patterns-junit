package com.example.creational.builder;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class UserTest {

    @Test

    void test1() {
        User user = new User.Builder()
                .setId(1L)
                .setFirstName("Alan")
                .setLastName("Sastre")
                .setEmail("asasa@asas.com")
                .setMarried(false)
                .build();

        assertInstanceOf(User.class, user);
    }

}