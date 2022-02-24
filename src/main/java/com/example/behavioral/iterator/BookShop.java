package com.example.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class BookShop implements Iterable<Book>{

    private  List<Book> books;

    private int maxStock;



    public BookShop() {
        books = new ArrayList<>();
        maxStock=5;
    }

    public BookShop(List<Book> books, int maxStock) {
        this.books = books;
        this.maxStock = maxStock;
    }

    public int getMaxStock() {
        return maxStock;
    }

    public void setMaxStock(int maxStock) {
        this.maxStock = maxStock;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book){
        books.add(book);
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShopIterator();
    }

    private class BookShopIterator implements Iterator<Book>{

        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return this.currentIndex < books.size();
        }

        @Override
        public Book next() {
        	if(!hasNext())
        		throw new NoSuchElementException();
        	
            return books.get(currentIndex++);
        }
    }
}
