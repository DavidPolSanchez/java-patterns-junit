package com.example.behavioral.chain;

public interface CoinInserter {
    CoinInserter setNextInserter(CoinInserter coinInserter);
    boolean insert(Coin coin);
}
