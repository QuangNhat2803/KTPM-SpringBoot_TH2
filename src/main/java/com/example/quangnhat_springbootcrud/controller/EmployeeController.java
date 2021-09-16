package com.example.quangnhat_springbootcrud.controller;

import com.example.quangnhat_springbootcrud.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeService;
}
