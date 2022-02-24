package com.example.behavioral.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {

    Book book1 = new Book("5656435", "Hawkins", 2021 );

    @Test
    void getIsbn() {
        assertEquals("5656435",book1.getIsbn());
    }

    @Test
    void setIsbn() {
        String newIsb="1111";
        book1.setIsbn("1111");
        assertEquals("1111",book1.getIsbn());
    }

    @Test
    void getAuthor() {
        assertEquals("Hawkins",book1.getAuthor());
    }

    @Test
    void setAuthor() {
        String newAuthor="Anónimo";
        book1.setAuthor(newAuthor);
        assertEquals(newAuthor,book1.getAuthor());
    }

    @Test
    void getYear() {
        assertEquals(2021,book1.getYear());
    }

    @Test
    void setYear() {
        int newYear=2022;
        book1.setYear(newYear);
        assertEquals(2022,book1.getYear());

    }
}