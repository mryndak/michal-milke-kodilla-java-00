package com.kodilla.good.patterns.chalenges;

import java.time.LocalDateTime;

public interface OrderService {
    boolean order (User user, LocalDateTime orderDate);
}
