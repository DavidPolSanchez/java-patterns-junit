package com.example.behavioral.command.demo.chain.coins;

public class CoinInserter1Dollar extends AbstractCoinInserter {

    private static final double COIN_DIAMETER_MM_1D = 100;
    private static final double COIN_WEIGHT_GR_1D = 100;

    @Override
    boolean isValidCoin(Coin coin) {
        return coin.diameter() == COIN_DIAMETER_MM_1D &&
                coin.weight() == COIN_WEIGHT_GR_1D;
    }
}
