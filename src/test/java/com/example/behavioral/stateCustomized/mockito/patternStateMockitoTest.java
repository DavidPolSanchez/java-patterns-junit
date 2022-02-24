package com.example.behavioral.stateCustomized.mockito;

import com.example.behavioral.stateCustomized.Order;
import com.example.behavioral.stateCustomized.OrderState;
import com.example.behavioral.stateCustomized.ProcessingState;
import com.example.behavioral.stateCustomized.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@DisplayName("Test de pattern state con mockito")
@ExtendWith(MockitoExtension.class)
class patternStateMockitoTest {

    @Mock
    OrderState state;

    @InjectMocks
    Order order;

    @Nested
    @DisplayName("Test sobre la clase Order")
    class OrderTest {
        @Test
        void nextStateTest() {
            order = new Order(1L, LocalDateTime.now(), state);
            when(state.next(any(Order.class))).thenReturn("Next state from mockito");
            String nextState = order.nextState();
            assertEquals("Next state from mockito", nextState);
            verify(state).next(order);//Por defecto verifica que se ha llamado una vez

        }

        @Test
        void previousStateTest() {
            order = new Order(1L, LocalDateTime.now(), state);
            when(state.previous(any(Order.class))).thenReturn("Previous state from mockito");
            String previousState = order.previousState();

            assertEquals("Previous state from mockito", previousState);
            verify(state).previous(order);//Por defecto verifica que se ha llamado una vez


        }

        @Test
        void orderGetterSetterTest() {
            Order order1 = new Order();//new Order(1L, LocalDateTime.now(),new ProcessingState());
            order1.setId(1L);
            order1.setDate(LocalDateTime.of(2022,02,24,19,59,00));
            order1.setState(new ProcessingState());

            Product p1 = new Product(1L,"prod1");
            Product p2 = new Product(2L,"prod2");;


            List<Product> listProds=List.of(p1,p2);
            order1.setProducts(listProds);
            assertEquals(1L,order1.getId());
            assertEquals(2022,order1.getDate().getYear());
            assertInstanceOf(ProcessingState.class,order1.getState());
            verifyNoInteractions(state);
        }
    }

}