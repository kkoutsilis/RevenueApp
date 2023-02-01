package com.kkoutilis.revenuevaluationapp.controllers;


import com.kkoutilis.revenuevaluationapp.models.Transaction;
import com.kkoutilis.revenuevaluationapp.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
public class TransactionController {

    private final TransactionService service;

    @Autowired
    public TransactionController(TransactionService service) {
        this.service = service;
    }


    @GetMapping("/transactions")
    public List<Transaction> getAll() {
        return this.service.getAll();
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

}
