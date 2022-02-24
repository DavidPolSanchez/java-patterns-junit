package com.example.behavioral.command.demo.chain.coins;

public interface CoinInserter {
    CoinInserter setNextInserter(CoinInserter coinInserter);
    boolean insert(Coin coin);
}
