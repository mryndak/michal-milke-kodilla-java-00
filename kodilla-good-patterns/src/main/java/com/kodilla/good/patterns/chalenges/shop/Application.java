package com.kodilla.good.patterns.chalenges.shop;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {

        Product product1 = new Product("HugoBoss",1);
        Product product2 = new Product("tasty beaf",1);
        Product product3 = new Product("onion", 5);

        Item item1 = new Item(product1, new BigDecimal(10.351));
        Item item2 = new Item(product2, new BigDecimal(4.731));
        Item item3 = new Item(product3, new BigDecimal(0.963));

        OrderProcessor processor = new OrderProcessor();

        processor.processOrder(new SephoraShop(),item1);
        processor.processOrder(new ButchersShop(),item2);
        processor.processOrder(new Greengrocer(),item3);
    }
}
