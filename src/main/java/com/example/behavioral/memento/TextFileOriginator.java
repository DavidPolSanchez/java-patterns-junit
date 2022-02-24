package com.example.behavioral.memento;

import java.util.UUID;

public class TextFileOriginator{
    private String id;
    private String name;
    private String content;

    public TextFileOriginator(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public TextFileSnapshot createSnapshot(int serialNo, String commitMessage){
        return new TextFileSnapshot(serialNo, this.id, this.name, this.content, commitMessage);
    }

    public void writeContent(String updatedContent) {
        this.content = updatedContent;
        System.out.println(this);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "TextFileOriginator{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}