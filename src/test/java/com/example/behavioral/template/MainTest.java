package com.example.behavioral.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MainTest {

    HtmlHome home = new HtmlHome();
    HtmlAboutUs about = new HtmlAboutUs();
    HtmlTemplate bodyHtmlHome = new HtmlHome();

    @Test
    void displayHeaderNotNull(){
        if(!bodyHtmlHome.head().isEmpty())
            System.out.println("\n head not Null: "+ bodyHtmlHome.head());
        assertNotNull(bodyHtmlHome.head());
    }

    @Test
    void displayHeaderEstructure(){
        if(!bodyHtmlHome.head().isEmpty())
            System.out.println("\n head not Null: "+ bodyHtmlHome.head().formatted());
        assertNotNull(bodyHtmlHome.head());
    }

    @Test
    void displayBodyNotNull(){
        if(!bodyHtmlHome.body().isEmpty())
        System.out.println("\n body not Null: "+ bodyHtmlHome.body());
        assertNotNull(bodyHtmlHome.body());
    }

    @Test
    void displayFooterNotNull(){
        if(!bodyHtmlHome.footer().isEmpty())
            System.out.println("\n footer not Null: "+ bodyHtmlHome.footer());
        assertNotNull(bodyHtmlHome.footer());
    }

    @Test
        void ValidateNotNull(){
        assertAll(
                () -> assertNotNull(!bodyHtmlHome.head().isEmpty()),
                () -> assertNotNull(!bodyHtmlHome.body().isEmpty()),
                () -> assertNotNull(!bodyHtmlHome.footer().isEmpty())
        );
    }

}