package org.example.doublewoods.controller;

import org.example.doublewoods.model.Customer;
import org.example.doublewoods.model.Menu;
import org.example.doublewoods.service.CustomerService;
import org.example.doublewoods.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class MenuController {
@Autowired
private MenuService menuService;

    @GetMapping("menu/findAll")
    public List<Menu> findAll() {
        return menuService.findAll();

    }
}