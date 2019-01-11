package com.kodilla.good.patterns.chalenges;

import java.time.LocalDateTime;

public class BookOrderService implements OrderService {
    @Override
    public boolean order(User user, LocalDateTime orderDate) {
        return true;
    }
}
