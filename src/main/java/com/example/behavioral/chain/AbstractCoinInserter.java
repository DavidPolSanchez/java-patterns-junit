package com.example.behavioral.chain;

public abstract class AbstractCoinInserter implements CoinInserter {

    private CoinInserter nextInserter;

    // establecer cadena de responsabilidad
    @Override
    public CoinInserter setNextInserter(CoinInserter coinInserter) {
        this.nextInserter = coinInserter;
        return this.nextInserter;
    }

    @Override
    public boolean insert(Coin coin) {
        if (isValidCoin(coin))
            return true;

        // como no ha podido resolverlo lo delega en el siguiente manejador
        return getNextInserter() != null && getNextInserter().insert(coin);
    }

    public CoinInserter getNextInserter() {
        return nextInserter;
    }

    abstract boolean isValidCoin(Coin coin); // template method
}
