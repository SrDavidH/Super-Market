package com.platzi.Platzimarket.web.controller;

import com.platzi.Platzimarket.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProducController {
    @Autowired
    private ProductService;

    public List<Product> getAll(){

    }

}
