package com.example.behavioral.chain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChainPatternTest {
    private CoinInserter sut;

    @BeforeEach
    public void initEach(){
        this.sut = new CoinInserter1Dollar();
        sut.setNextInserter(new CoinInserter50Cent())
                .setNextInserter(new CoinInserter25Cent());
    }

    @Test
    void whenCoinInserter1DolarIsValid() {
        Coin coin1d = new Coin(100, 100); // 1 dollar
        boolean accepted = sut.insert(coin1d);

        assertTrue(accepted);
    }

    @Test
    void whenCoinInserter25centsIsValid() {
        Coin coin25 = new Coin(25, 25); // 1 dollar
        boolean accepted = sut.insert(coin25);

        assertTrue(accepted);
    }

    @Test
    void whenCoinInserter50centsIsValid() {
        Coin coin50 = new Coin(50, 50); // 1 dollar
        boolean accepted = sut.insert(coin50);

        assertTrue(accepted);
    }

    @Test
    void whenInsertFalseCoin() {
        Coin falseCoin = new Coin(1000, 1000); // 1 dollar
        boolean accepted = sut.insert(falseCoin);

        assertFalse(accepted);
    }
}
