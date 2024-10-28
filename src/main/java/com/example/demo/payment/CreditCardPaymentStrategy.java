package com.example.demo.payment;

import com.example.demo.model.Item;
import java.util.List;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public void pay(List<Item> items) {
        System.out.println("Paying for " + items + " using credit card");
    }

}
