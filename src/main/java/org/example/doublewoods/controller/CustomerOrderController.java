package org.example.doublewoods.controller;

import org.example.doublewoods.model.CustomerOrder;
import org.example.doublewoods.model.Menu;
import org.example.doublewoods.service.CustomerOrderService;
import org.example.doublewoods.service.CustomerService;
import org.example.doublewoods.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class CustomerOrderController {

@Autowired
private CustomerOrderService CustomerOrderService;

    @GetMapping("customerOrder/findAll")
    public List<CustomerOrder> findAll() {
        return CustomerOrderService.findAll();
    }
}