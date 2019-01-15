package com.kodilla.good.patterns.chalenges.shop;

public class ButchersShop implements Food2Door {
    @Override
    public boolean process(Item item) {
        System.out.println("Welcome to ButchersShop. Bloody taste of tomorrow!");
        return true;
    }

}

