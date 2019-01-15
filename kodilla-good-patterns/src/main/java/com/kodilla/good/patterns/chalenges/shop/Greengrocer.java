package com.kodilla.good.patterns.chalenges.shop;

public class Greengrocer implements Shop {
    @Override
    public boolean process(Item item) {
        System.out.println("Welcome to Greengrocer. Healthy taste of tomorrow!");
        return true;
    }
}
