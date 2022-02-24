package com.example.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements File {

    private final List<File> files = new ArrayList<>();

    public String getType() {
        return "directory";
    }

    public void addFile(File file) {
        files.add(file);
    }

    public Long getSize() {
        Long size = 0L;

        for (File file : files)
            size += file.getSize();

        return size;
    }
}
