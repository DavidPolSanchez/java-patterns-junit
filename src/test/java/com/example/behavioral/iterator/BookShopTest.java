package com.example.behavioral.iterator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests de Librería")
class BookShopTest {

    BookShop bookShop= new BookShop();

    @Test
    @DisplayName("Prueba librería vacía")
    void libreriaVaciaTest() {
        assertEquals(0, bookShop.getBooks().size());
    }

    @Test
    @DisplayName("Insertar un libro")
    void addOneBookTest() {
        int numlibrosBefore = bookShop.getBooks().size();
        Book book1 = new Book("5656435", "Hawkins", 2021 );
        bookShop.addBook(book1);
        int numlibrosAfter = bookShop.getBooks().size();
        assertEquals(1,numlibrosAfter-numlibrosBefore);
    }

    @Test
    void addAlotofBooks() {
        int numlibrosBefore = bookShop.getBooks().size();

        Book book1 = new Book("5656435", "Hawkins", 2021 );
        Book book2 = new Book("124234fdfg", "Tolle", 1997 );
        Book book3 = new Book("42536357657", "David", 1500 );

        bookShop.addBook(book1);
        bookShop.addBook(book2);
        bookShop.addBook(book3);

        int numlibrosAfter = bookShop.getBooks().size();

        assertEquals(3,numlibrosAfter-numlibrosBefore);
    }

    @Test
    @DisplayName("Prueba de no exceder el stock máximo")
    void notExceedStockTest() {
        Book book1 = new Book("5656435", "Hawkins", 2021 );
        Book book2 = new Book("124234fdfg", "Tolle", 1997 );
        Book book3 = new Book("42536357657", "David", 1500 );
        Book book4 = new Book("42536357658", "Pepe", 1500 );
        Book book5 = new Book("42536357659", "Pitingo", 1500 );
        //Book book6 = new Book("42536357650", "Tintin", 1500 );

        bookShop.addBook(book1);
        bookShop.addBook(book2);
        bookShop.addBook(book3);
        bookShop.addBook(book4);
        bookShop.addBook(book5);
        //bookShop.addBook(book6);

        assertTrue(bookShop.getMaxStock()>=bookShop.getBooks().size());

    }

    @Test
    @DisplayName("TEst establecer stock máximo")
    void setMaxStock() {
        int newStock=4;

        bookShop.setMaxStock(newStock);

        assertEquals(newStock,bookShop.getMaxStock());
    }

    @Test
    @DisplayName ("Validar lista de libros insertada en la libreria")
    void setBooks() {

        Book book1 = new Book("5656435", "Hawkins", 2021 );
        Book book2 = new Book("124234fdfg", "Tolle", 1997 );
        Book book3 = new Book("42536357657", "David", 1500 );
        Book book4 = new Book("42536357658", "Pepe", 1500 );

        List<Book> testBooks = new ArrayList<>();

        testBooks.add(book1);
        testBooks.add(book2);
        testBooks.add(book3);
        testBooks.add(book4);

        bookShop.setBooks(testBooks);

        assertArrayEquals(testBooks.toArray(), bookShop.getBooks().toArray());

    }

}