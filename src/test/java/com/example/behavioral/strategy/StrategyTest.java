package com.example.behavioral.strategy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Nested
@DisplayName("StrategyTest: Test para el patrón Strategy")
class StrategyTest {
    ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
    ShopCart cart = new ShopCart();
    Product product1 = new Product("1422342342DSFDSF", 9.99);
    Product product2 = new Product("1422342342DSFDSF", 99.99);

    @Test
    void addProductTest() throws IOException {

        System.setOut(new PrintStream(byteOutput));
        cart.addProduct(product1);
        cart.addProduct(product2);

        byteOutput.flush();
        String allWrittenLines = byteOutput.toString();
        assertTrue(allWrittenLines.contains("añadido"));
    }

    @Test
    void payProductTest() throws IOException {

        System.setOut(new PrintStream(byteOutput));
        cart.pay(new PayPalStrategy("","",""));
        cart.pay(new CreditCardStrategy("","","", ""));
        cart.pay(
                (amount) -> System.out.println(amount)
        );

        byteOutput.flush();
        String allWrittenLines = byteOutput.toString();
        assertTrue(allWrittenLines.contains("pagado"));
    }
}
