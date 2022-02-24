package com.example.structural.proxy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

@DisplayName("Unit test of Proxy pattern")
class ProxyTest {

    @Test
    void test1 () {
        final Image img1 = new ProxyImage("holamundo.jpg");

        img1.show();
        final RealImage realImage1 = img1.getImage();

        img1.show();
        final RealImage realImage2 = img1.getImage();

        assertSame(realImage1, realImage2);
    }

    @Test
    void whenInstanceRealImgInvokeloadFromDisk() {

    }
}