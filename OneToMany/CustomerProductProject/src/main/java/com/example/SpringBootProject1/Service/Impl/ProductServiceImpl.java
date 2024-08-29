package com.example.SpringBootProject1.Service.Impl;

import com.example.SpringBootProject1.Repository.ProductRepository;
import com.example.SpringBootProject1.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
}
