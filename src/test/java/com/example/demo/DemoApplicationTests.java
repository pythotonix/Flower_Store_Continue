package com.example.demo;

import static org.mockito.Mockito.verify;

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
        items = List.of(new Item("Rose", 10, 20),
		new Item("Lily", 5, 10));
    }

    @Test
    void testDHLDelivery() {
        dhlDelivery.deliver(items);
        verify(dhlDelivery).deliver(items);
    }

    @Test
    void testPostDelivery() {
        postDelivery.deliver(items);
        verify(postDelivery).deliver(items);
    }

	@Test
	void testPayPalPayment() {
		payPalPayment.pay(items);
		verify(payPalPayment).pay(items);
	}

	@Test
	void testCreditCardPayment() {
		creditCardPayment.pay(items);
		verify(creditCardPayment).pay(items);
	}

}
