package com.example.structural.composite;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Composite pattern tests")
class CompositeTest {

    @Test
    @DisplayName("Add a file to a directory")
    void addFileToDirectory() {

        TextFile textFile = new TextFile(100L);
        Directory directory = new Directory();

        directory.addFile(textFile);

        assertEquals(100L, directory.getSize());
    }

    @Test
    @DisplayName("Add a directory with a file to another directory")
    void addDirectoryToDirectory() {

        TextFile textFile1 = new TextFile(100L);
        Directory directory1 = new Directory();
        directory1.addFile(textFile1);

        TextFile textFile2 = new TextFile(300L);
        Directory directory2 = new Directory();
        directory2.addFile(textFile2);
        directory2.addFile(directory1);

        assertEquals(400L, directory2.getSize());
    }

    @Test
    @DisplayName("Create a file of the type text file")
    void textFileTypeTest() {

        File directory = new Directory();

        assertEquals("directory", directory.getType());
    }

    @Test
    @DisplayName("Create a file of the type directory")
    void directoryTypeTest() {

        File textFile = new TextFile(100L);

        assertEquals("txt", textFile.getType());
    }

}