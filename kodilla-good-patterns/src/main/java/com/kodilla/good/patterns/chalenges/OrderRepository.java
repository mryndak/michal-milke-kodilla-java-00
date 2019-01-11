package com.kodilla.good.patterns.chalenges;

import java.time.LocalDateTime;

public interface OrderRepository {
    boolean create (User user, LocalDateTime orderDate);
}
