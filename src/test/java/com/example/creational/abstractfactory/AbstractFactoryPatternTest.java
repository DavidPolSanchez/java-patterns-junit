package com.example.creational.abstractfactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AbstractFactoryPatternTest {

    AbstractFactory currentFactory;
    AbstractFactory investmentFactory;

    @Nested
    @DisplayName("Tests for current account factory")
    class CurrentAccountFactoryTests {

        @BeforeEach
        void beforeEach() {
            currentFactory = FactoryProvider.getFactory("current");
        }

        @Test
        void createCurrentFactoryTest() {
            assertInstanceOf(CurrentAccountFactory.class, currentFactory);
        }

        @Test
        void createBasicCurrentAccountTest() {
            assertInstanceOf(BasicCurrentAccount.class, currentFactory.create("basic"));
        }

        @Test
        void createPremiumCurrentAccountTest() {
            assertInstanceOf(PremiumCurrentAccount.class, currentFactory.create("premium"));
        }

        @Test
        void createUnexpectedCurrentAccountTest() {
            assertThrows(IllegalArgumentException.class, () -> currentFactory.create("unexpected"));
        }
    }

    @Nested
    @DisplayName("Tests for investment account factory")
    class InvestmentAccountFactoryTests {

        @BeforeEach
        void beforeEach() {
            investmentFactory = FactoryProvider.getFactory("investment");
        }

        @Test
        void createInvestmentFactoryTest() {
            assertInstanceOf(InvestmentAccountFactory.class, investmentFactory);
        }

        @Test
        void createInstitutionalInvestmentAccountTest() {
            assertInstanceOf(InstitutionalInvAccount.class, investmentFactory.create("institutional"));
        }

        @Test
        void createRetailInvestmentAccountTest() {
            assertInstanceOf(RetailInvAccount.class, investmentFactory.create("retail"));
        }

        @Test
        void createUnexpectedInvestmentAccountTest() {
            assertThrows(IllegalArgumentException.class, () -> investmentFactory.create("unexpected"));
        }
    }

    @Test
    void createUnexpectedFactoryTest() {
        assertThrows(IllegalArgumentException.class, () -> FactoryProvider.getFactory("unexpected"));
    }
}