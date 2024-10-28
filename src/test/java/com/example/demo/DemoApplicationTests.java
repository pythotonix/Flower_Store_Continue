package com.example.demo;

import org.mockito.Mockito;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import com.example.demo.delivery.DHLDeliveryStrategy;
import com.example.demo.delivery.PostDeliveryStrategy;
import com.example.demo.model.Item;
import com.example.demo.payment.CreditCardPaymentStrategy;
import com.example.demo.payment.PayPalPaymentStrategy;

@SpringBootTest
class DemoApplicationTests {

    private static final int ITEM_PRICE_ROSE = 10;
    private static final int ITEM_QUANTITY_ROSE = 20;
    private static final int ITEM_PRICE_LILY = 5;
    private static final int ITEM_QUANTITY_LILY = 10;

    @SpyBean
    private DHLDeliveryStrategy dhlDelivery;

    @SpyBean
    private PostDeliveryStrategy postDelivery;

    @SpyBean
    private PayPalPaymentStrategy payPalPayment;

    @SpyBean
    private CreditCardPaymentStrategy creditCardPayment;

    private List<Item> items;

    @BeforeEach
    void setUp() {
        items = List.of(
            new Item("Rose", ITEM_PRICE_ROSE, ITEM_QUANTITY_ROSE),
            new Item("Lily", ITEM_PRICE_LILY, ITEM_QUANTITY_LILY)
        );
    }

    @Test
    void testDHLDelivery() {
        dhlDelivery.deliver(items);
        Mockito.verify(dhlDelivery).deliver(items);
    }

    @Test
    void testPostDelivery() {
        postDelivery.deliver(items);
        Mockito.verify(postDelivery).deliver(items);
    }

    @Test
    void testPayPalPayment() {
        payPalPayment.pay(items);
        Mockito.verify(payPalPayment).pay(items);
    }

    @Test
    void testCreditCardPayment() {
        creditCardPayment.pay(items);
        Mockito.verify(creditCardPayment).pay(items);
    }
}
