package com.kodilla.good.patterns.chalenges;

import java.time.LocalDateTime;

public class BookOrderRepository implements OrderRepository {
    @Override
    public boolean create(User user, LocalDateTime orderDate) {
        return true;
    }
}
