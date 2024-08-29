package com.example.SpringBootProject1.Service.Impl;

import com.example.SpringBootProject1.Repository.CustomerRepository;
import com.example.SpringBootProject1.Repository.ProductRepository;
import com.example.SpringBootProject1.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

}
