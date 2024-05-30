package org.example.doublewoods.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "menu")
public class Menu {
    @Id
    @Column(name = "menu_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer menuId;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Integer price;

    @Column(name = "description")
    private String description;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "sell_status")
    private boolean sellStatus;

    @Column(name = "seasonal")
    private boolean seasonal;

    @Column(name = "type")
    private String type;

    @Column(name = "secondary_type")
    private String secondaryType;

    @Column(name = "ice_hot")
    private boolean iceHot;

    @OneToOne(mappedBy = "menu")
    @JsonIgnore
    private OrderDetail orderDetail;

}
