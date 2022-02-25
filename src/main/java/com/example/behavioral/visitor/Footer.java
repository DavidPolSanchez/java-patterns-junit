package com.example.behavioral.visitor;

public class Footer extends Element {
    String content;

    public Footer(String uuid) {
        super(uuid);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public Footer(String uuid, String content) {
        super(uuid);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}