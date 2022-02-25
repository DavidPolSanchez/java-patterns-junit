package com.example.behavioral.template;

public interface Prueba {


    default String render(){ // método plantilla
        return head() + body() + footer();
    }

    String footer();

    String body();

    String head();
}
