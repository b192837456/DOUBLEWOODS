package org.example.doublewoods.controller;

import org.example.doublewoods.model.Menu;
import org.example.doublewoods.model.OrderDetail;
import org.example.doublewoods.service.MenuService;
import org.example.doublewoods.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class OrderDetailController {
@Autowired
private OrderDetailService orderDetailService;

    @GetMapping("orderDetail/findAll")
    public List<OrderDetail> findAll() {
        return orderDetailService.findAll();

    }
}