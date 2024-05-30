package org.example.doublewoods.service;

import org.example.doublewoods.model.CustomerOrder;

import java.util.List;


public interface CustomerOrderService {
    public List<CustomerOrder> findAll();
}
