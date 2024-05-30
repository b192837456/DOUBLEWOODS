package org.example.doublewoods.reponsitory;

import org.example.doublewoods.model.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Integer> {

}
