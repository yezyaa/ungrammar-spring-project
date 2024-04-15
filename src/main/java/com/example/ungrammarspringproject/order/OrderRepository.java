package com.example.ungrammarspringproject.order;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class OrderRepository {
    private Map<Integer, Order> db = new HashMap<>();
    private int id = 1;

    public List<Order> findOrders() {
        return new ArrayList<>(db.values());
    }

    public Order findOrder(int idx) {
        return db.get(idx);
    }

    // 주문할 목록 저장하기
    public void save(Order order) {
        System.out.println(order.getFoodName());
        db.put(id++, order);
    }
}