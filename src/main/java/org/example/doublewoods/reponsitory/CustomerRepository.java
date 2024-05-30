package org.example.doublewoods.reponsitory;

import org.example.doublewoods.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
