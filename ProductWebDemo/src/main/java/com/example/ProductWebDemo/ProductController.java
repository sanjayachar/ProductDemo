package com.example.ProductWebDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService ps;
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return ps.getAllProducts();
    }
    @GetMapping("/products/{name}")
    public Product getProduct(@PathVariable String name){
        return ps.getProduct(name);
    }
    @PostMapping("/products")
    public void addProduct(@RequestBody Product p){
        ps.addProduct(p);
    }
    @GetMapping("/test")
    public ModelAndView testJsp(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("message","Hello from SpringBoot!");
        return modelAndView;
    }

}
