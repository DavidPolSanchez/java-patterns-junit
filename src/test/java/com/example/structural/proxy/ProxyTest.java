package com.example.structural.proxy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@DisplayName("Unit test of Proxy pattern")
@ExtendWith(MockitoExtension.class)
class ProxyTest {

    @Mock
    RealImage realImageMock;

    @InjectMocks
    ProxyImage proxy;

    private final static String FILENAME = "holamundo.jpg";

    @Test
    void test1 () {
        final Image img1 = new ProxyImage("holamundo.jpg");

        img1.show();
        final RealImage realImage1 = img1.getImage();

        img1.show();
        final RealImage realImage2 = img1.getImage();

        assertSame(realImage1, realImage2);
    }
/*
    @Test
    @DisplayName("Test Proxy pattern with mockito")
    void whenInvokingShowImageThenReturnSameInstance() {
       // RealImage realImage = spy(new RealImage(FILENAME));
        proxy = new ProxyImage(FILENAME);
        proxy.show();
        //verifyNew(RealImage.class, times());
       // when(proxy.())
        verify(realImageMock, times(1)).new(FILENAME);
       // PowerMockito.verifyNew(ClassUnderTest.class).withArguments(name, condition);
    }
 */
}