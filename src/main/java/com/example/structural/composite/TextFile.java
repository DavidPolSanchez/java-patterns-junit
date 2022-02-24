package com.example.structural.composite;

public class TextFile implements File {

    private final Long size;

    public TextFile(Long size) {
        this.size = size;
    }

    public String getType() {
        return "txt";
    }

    public Long getSize() {
        return this.size;
    }

}
