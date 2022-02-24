package com.example.behavioral.command.demo.visitor;

public interface Visitor {

    void visit(XmlElement xe);

    void visit(JsonElement je);

    String visit(Footer footer);
}