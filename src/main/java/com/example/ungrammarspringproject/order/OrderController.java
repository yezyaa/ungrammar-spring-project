package com.example.ungrammarspringproject.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // @Controller + @ResponseBody
public class OrderController {

    @Autowired // 컨테이너에 등록된 스프링 빈을 주입(DI) => IoC 완료
    private OrderService orderService;

    // 전체 주문 내역 조회
    @GetMapping("/orders")
    public List<Order> findOrders() {
        return orderService.findOrders();
    }

    // 주문 내역 단일 조회
    @GetMapping("/orders/{id}")
    public Order findOrder(@PathVariable("id") int id) {
        System.out.println("GET");
        System.out.println(id);
        return orderService.findOrder(id);
    }

    // 음식 등록
    @PostMapping("/orders")
    public void createOrder(@RequestBody Order order) {
        System.out.println("POST");
        orderService.createOrder(order);
    }
}