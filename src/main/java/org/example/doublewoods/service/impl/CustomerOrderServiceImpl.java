package org.example.doublewoods.service.impl;

import org.example.doublewoods.model.CustomerOrder;
import org.example.doublewoods.reponsitory.CustomerOrderRepository;
import org.example.doublewoods.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {
    @Autowired private CustomerOrderRepository customerOrderRepository;

    @Override
    public List<CustomerOrder> findAll() {
        return customerOrderRepository.findAll();
    }
}
