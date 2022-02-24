package com.example.behavioral.memento;

public class TextFileRepository {

    public void create() {
        System.out.println("Add a text file to the repository.");
    }

    public void retrieve(int id) {
        System.out.println("Get a text file with id " + id + " from repository.");
    }
}
