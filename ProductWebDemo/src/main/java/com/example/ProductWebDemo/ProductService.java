package com.example.ProductWebDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository rp;

    public List<Product> getAllProducts(){
        return  rp.findAll();
    }
    public Product getProduct(String name){
        return rp.findByName(name);
    }

    public void addProduct(Product p) {
        rp.save(p);
    }
}
