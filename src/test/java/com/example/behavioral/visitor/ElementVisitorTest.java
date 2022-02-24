package com.example.behavioral.visitor;

import com.example.behavioral.command.demo.visitor.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

class ElementVisitorTest {

    Document d;
    Visitor v;

    @BeforeEach
    void init() {
        d = new Document(UUID.randomUUID().toString());
        d.addElement(new JsonElement(UUID.randomUUID().toString()));
        d.addElement(new Footer(UUID.randomUUID().toString()));
        d.addElement(new XmlElement(UUID.randomUUID().toString()));
        v = new ElementVisitor();
    }

    @Test
    @DisplayName("Prueba del método con 3 tipos de datos")
    void acceptTest() {
        d.accept(v);
    }
}