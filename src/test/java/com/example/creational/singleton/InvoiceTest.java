package com.example.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvoiceTest {

    @Test
    void invoiceTest() {
        Invoice invoice = new Invoice();
        double result = invoice.calculateTotalPrice(1, 1);
        assertEquals(2, result);
    }
}