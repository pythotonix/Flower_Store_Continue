package com.example.demo.model;

public class Item {
    private String name;
    private int quantity;
    private double price;

    public Item(String newName, int newQuantity, double newPrice) {
        this.name = newName;
        this.quantity = newQuantity;
        this.price = newPrice;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}