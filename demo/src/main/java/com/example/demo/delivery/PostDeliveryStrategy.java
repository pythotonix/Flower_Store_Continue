package com.example.demo.delivery;

import com.example.demo.model.Item;
import java.util.List;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public void deliver(List<Item> items) {
        System.out.println("You got post delivery!");
    }
}