package org.example.doublewoods.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "order_detail")
public class OrderDetail {
    @Id
    @Column(name = "order_detail_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer OrderDetailId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private CustomerOrder customerOrder;

    @OneToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;

    @Column(name = "quantity")
    private Integer quantity;


}
