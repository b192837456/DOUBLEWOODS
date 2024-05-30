package org.example.doublewoods.service.impl;

import org.example.doublewoods.model.Customer;
import org.example.doublewoods.reponsitory.CustomerRepository;
import org.example.doublewoods.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
