package com.example.behavioral.state;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Order order = new Order(1L, LocalDateTime.now());
    @Test
    void nextStat(){
        order.nextState();
        order.nextState();
        order.previousState();
        order.previousState();
        order.nextState();
        order.nextState();
        assertInstanceOf(Order.class,order);
    }

}