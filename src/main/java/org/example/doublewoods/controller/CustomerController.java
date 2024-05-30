package org.example.doublewoods.controller;

import org.example.doublewoods.model.Customer;
import org.example.doublewoods.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class CustomerController {
@Autowired
private CustomerService CustomerService;

    @GetMapping("customer/findAll")
    public List<Customer> findAll() {
        return CustomerService.findAll();

    }
}