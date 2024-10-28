package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.model.Flower;
import com.example.demo.model.FlowerColor;
import com.example.demo.model.FlowerType;

import java.util.List;

@RestController
@RequestMapping("/api/v")
public class FlowerController {

    private static final double MAX_PRICE = 100.0;
    private static final double MAX_SEPAL_LENGTH = 10.0;

    private Flower randomFlower() {
        FlowerType[] flowerTypes = FlowerType.values();
        FlowerType flowerType = flowerTypes[
            (int) (Math.random() * flowerTypes.length)];
        FlowerColor[] flowerColors = FlowerColor.values();
        FlowerColor flowerColor = flowerColors[
            (int) (Math.random() * flowerColors.length)];
        double price = Math.random() * MAX_PRICE;
        double sepalLength = Math.random() * MAX_SEPAL_LENGTH;
        Flower flower = new Flower();
        flower.setType(flowerType);
        flower.setPrice(price);
        flower.setSepalLength(sepalLength);
        flower.setColor(flowerColor);
        return flower;
    }

    @GetMapping("/flower")
    public List<Flower> getFlower() {
        return List.of(randomFlower(), randomFlower(), randomFlower());
    }

}
