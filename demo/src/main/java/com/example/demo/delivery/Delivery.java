package com.example.demo.delivery;

import com.example.demo.model.Item;

import java.util.List;

public interface Delivery {
    void deliver(List<Item> items);
}