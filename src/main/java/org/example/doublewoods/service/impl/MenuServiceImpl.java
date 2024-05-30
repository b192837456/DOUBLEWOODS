package org.example.doublewoods.service.impl;

import org.example.doublewoods.model.Menu;
import org.example.doublewoods.reponsitory.MenuRepository;
import org.example.doublewoods.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired private MenuRepository menuRepository;

    @Override
    public List<Menu> findAll() {
        return menuRepository.findAll();
    }
}
