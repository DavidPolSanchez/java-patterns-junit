package com.example.behavioral.memento;

import java.time.LocalDateTime;

public class TextFileSnapshot{

    private int serialNo;
    private String id;
    private String name;
    private String content;
    private String commitMessage;
    private LocalDateTime commitTime;

    public TextFileSnapshot(int serialNo, String id, String name, String content, String commitMessage) {
        this.serialNo = serialNo;
        this.id = id;
        this.name = name;
        this.content = content;
        this.commitMessage = commitMessage;
        this.commitTime = LocalDateTime.now();
    }

    public int getSerialNo() {
        return serialNo;
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

    public String getCommitMessage() {
        return commitMessage;
    }

    @Override
    public String toString() {
        return "TextFileSnapshot{" +
                "serialNo=" + serialNo +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", commitMessage='" + commitMessage + '\'' +
                ", commitTime=" + commitTime +
                '}';
    }
}