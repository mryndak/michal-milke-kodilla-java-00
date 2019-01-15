package com.kodilla.good.patterns.chalenges.shop;

public class SephoraShop implements Shop {
    @Override
    public boolean process(Item item) {
        System.out.println("Welcome to SephoraShop. Marvelous smell of tomorrow!");
        return true;
    }

}
