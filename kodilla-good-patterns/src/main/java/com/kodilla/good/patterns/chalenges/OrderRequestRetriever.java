package com.kodilla.good.patterns.chalenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Jan", "Kowalski");

        LocalDateTime orderDate = LocalDateTime.of(2018,5,20,14,25);

        return new OrderRequest (user, orderDate);

    }
}

