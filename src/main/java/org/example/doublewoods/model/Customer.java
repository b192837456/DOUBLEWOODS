package org.example.doublewoods.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "costumer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer costumerId;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private Integer phone;

    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<CustomerOrder> custmoerOrders;
}
