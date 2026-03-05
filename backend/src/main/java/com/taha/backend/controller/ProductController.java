package com.taha.backend.controller;

import com.taha.backend.entity.Product;
import com.taha.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/products")
public class ProductController {



    private final ProductService service;
@Autowired
    public ProductController(ProductService service) {
        this.service =  service;
    }

    @PostMapping
    public Product add(@RequestBody Product product) {
        return service.addProduct(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return service.getProductById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteProduct(id);
    }


}