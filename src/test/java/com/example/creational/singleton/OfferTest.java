package com.example.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OfferTest {

    @Test
    void offerTest() {
        Offer offer = new Offer();
        double result = offer.calculateTotalOffer(1, 1);
        assertEquals(2, result);
    }

}