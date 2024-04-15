package com.example.ungrammarspringproject.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // @Service에 @Component가 이미 들어있음 => 스프링 빈 등록 완료
public class OrderService {

    private OrderRepository orderRepository;

    @Autowired
    OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> findOrders() {
        return orderRepository.findOrders();
    }

    public Order findOrder(int id) {
        return orderRepository.findOrder(id);
    }

    public void createOrder(Order order) {
        orderRepository.save(order);
    }
}