package com.example.demo.payment;

import com.example.demo.model.Item;
import java.util.List;

public interface Payment {
    void pay(List<Item> items);
}