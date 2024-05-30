package org.example.doublewoods.reponsitory;

import org.example.doublewoods.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
}
