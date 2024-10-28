package com.example.demo.payment;

import java.util.List;

import com.example.demo.model.Item;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public void pay(List<Item> items) {
        System.out.println("Paying for " + items + " using PayPal");
    }

}
