package org.example.doublewoods.service.impl;

import org.example.doublewoods.model.OrderDetail;
import org.example.doublewoods.reponsitory.OrderDetailRepository;
import org.example.doublewoods.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {
    @Autowired private OrderDetailRepository orderDetailRepository;
    public List<OrderDetail> findAll() {
        return orderDetailRepository.findAll();

    }
}
