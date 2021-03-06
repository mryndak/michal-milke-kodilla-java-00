package com.kodilla.good.patterns.chalenges.shop;

public class OrderProcessor {
    public void processOrder(Food2Door shop, Item item) {
        boolean ordered = shop.process(item);
        if(ordered) {
            System.out.println("Your order is beeing created...");
        } else {
            System.out.println("Your order was rejected... Please contact our support...");
        }
    }
}