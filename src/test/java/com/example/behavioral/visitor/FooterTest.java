package com.example.behavioral.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FooterTest {

    public static final String TEST_STRING = "test";

    @Test
    void setContentTest() {
        Footer footer = new Footer("TEST_STRING", "TEST_STRING");
        footer.setContent(TEST_STRING);
        assertEquals(footer.getContent(), TEST_STRING);
    }
}