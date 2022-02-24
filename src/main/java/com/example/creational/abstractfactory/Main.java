package com.example.creational.abstractfactory;

public class Main {

    public static void main(String[] args) {
    }
}

interface AbstractFactory{
    Account create(String type);
}

class Account{}

class CurrentAccount extends Account{}
class BasicCurrentAccount extends CurrentAccount{}
class PremiumCurrentAccount extends CurrentAccount{}

class InvestmentAccount extends Account{}
class InstitutionalInvAccount extends InvestmentAccount{}
class RetailInvAccount extends InvestmentAccount{}

class CurrentAccountFactory implements AbstractFactory{

    @Override
    public CurrentAccount create(String type) {
        return switch (type){
            case "basic" -> new BasicCurrentAccount();
            case "premium" -> new PremiumCurrentAccount();
            default -> throw new IllegalArgumentException("not a valid type");
        };
    }
}

class InvestmentAccountFactory implements AbstractFactory{

    @Override
    public InvestmentAccount create(String type) {
        return switch (type){
            case "institutional" -> new InstitutionalInvAccount();
            case "retail" -> new RetailInvAccount();
            default -> throw new IllegalArgumentException("not a valid type");
        };
    }
}
class FactoryProvider {
    public static AbstractFactory getFactory(String type){
        return switch (type){
            case "current" -> new CurrentAccountFactory();
            case "investment" -> new InvestmentAccountFactory();
            default -> throw new IllegalArgumentException("not a valid type");
        };
    }
}
