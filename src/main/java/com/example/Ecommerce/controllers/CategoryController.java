package com.example.Ecommerce.controllers;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CategoryController {
    @GetMapping("/employees")
    String get_ans(){
        return "paras";
    }

}