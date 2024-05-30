package org.example.doublewoods.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "customer_order")
public class CustomerOrder {
    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    @Column(name = "order_time")
    private Date orderTime;

    @Column(name = "tolal_price")
    private Integer tolalPrice;

    @Column(name = "order_status")
    private String orderStatus;

    @Column(name = "delivery_address")
    private String deliveryAddress;

    @Column(name = "delivery_time")
    private String deliveryTime;

    @Column(name = "order_mode")
    private String orderMode;

    @OneToMany(mappedBy = "customerOrder")
    private List<OrderDetail> orderDetails = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "costumer_id")
    private Customer customer;



}
