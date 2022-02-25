package com.example.behavioral.stateCustomized.mockito;

import com.example.behavioral.stateCustomized.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
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
            assertEquals(listProds,order1.getProducts());
        }
    }

    @Nested
    @DisplayName("Test sobre la clase ProcesingState")
    class ProcessingStateTest {

        ProcessingState processingState = new ProcessingState();

        @Test
        void nextTest() {
            Order order = new Order();
            order.setId(1L);
            order.setDate(LocalDateTime.of(2022,02,24,19,59,00));
            order.setState(processingState);

            String responseExpected=String.format("Updating Order %d from %s to %s.",
                    order.getId(),
                    ProcessingState.class.getSimpleName(),
                    ShippedState.class.getSimpleName()
            );

            String response=processingState.next(order);

            assertTrue(responseExpected.compareTo(response)==0);

        }

        @Test
        void previousTest() {
            Order order = new Order();
            order.setId(1L);
            order.setDate(LocalDateTime.of(2022,02,24,19,59,00));
            order.setState(processingState);

            String responseExpected="Root state";

            String response=processingState.previous(order);

            assertTrue(responseExpected.compareTo(response)==0);

        }
    }

    @Nested
    @DisplayName("Test sobre la clase ProcesingState")
    class ShippedStateTest {

        ShippedState shippedState = new ShippedState();

        @Test
        void nextTest() {
            Order order = new Order();
            order.setId(1L);
            order.setDate(LocalDateTime.of(2022,02,24,19,59,00));
            order.setState(shippedState);

            String responseExpected=String.format("Updating Order %d from %s to %s.",
                    order.getId(),
                    ShippedState.class.getSimpleName(),
                    DeliveredState.class.getSimpleName()
            );

            String response=shippedState.next(order);

            assertTrue(responseExpected.compareTo(response)==0);

        }

        @Test
        void previousTest() {
            Order order = new Order();
            order.setId(1L);
            order.setDate(LocalDateTime.of(2022,02,24,19,59,00));
            order.setState(shippedState);

            String responseExpected=String.format("Updating Order %d from %s to %s.",
                    order.getId(),
                    ShippedState.class.getSimpleName(),
                    ProcessingState.class.getSimpleName()
            );

            String response=shippedState.previous(order);

            assertTrue(responseExpected.compareTo(response)==0);

        }
    }


    @Nested
    @DisplayName("Test sobre la clase ProcesingState")
    class DeliveredStateTest {

        DeliveredState deliveredState = new DeliveredState();

        @Test
        void nextTest() {
            Order order = new Order();
            order.setId(1L);
            order.setDate(LocalDateTime.of(2022,02,24,19,59,00));
            order.setState(deliveredState);

            String responseExpected="Order delivered, ends!";

            String response=deliveredState.next(order);

            assertTrue(responseExpected.compareTo(response)==0);

        }

        @Test
        void previousTest() {
            Order order = new Order();
            order.setId(1L);
            order.setDate(LocalDateTime.of(2022,02,24,19,59,00));
            order.setState(deliveredState);

            String responseExpected=String.format("Updating Order %d from %s to %s.",
                    order.getId(),
                    DeliveredState.class.getSimpleName(),
                    ShippedState.class.getSimpleName()
            );

            String response=deliveredState.previous(order);

            assertTrue(responseExpected.compareTo(response)==0);

        }
    }


}