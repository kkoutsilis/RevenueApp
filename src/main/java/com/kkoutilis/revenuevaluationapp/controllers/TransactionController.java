package com.kkoutilis.revenuevaluationapp.controllers;


import com.kkoutilis.revenuevaluationapp.DTOs.Report;
import com.kkoutilis.revenuevaluationapp.models.Transaction;
import com.kkoutilis.revenuevaluationapp.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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

    @PostMapping("/transactions")
    public Transaction create(@RequestBody Transaction transaction) {
        return service.create(transaction);
    }

    @DeleteMapping("/transactions/{id}")
    public boolean delete(@PathVariable(value = "id") UUID id) {
        return service.delete(id);
    }

    @GetMapping("/transactions/report")
    public Report getReport() {
        return this.service.calcReport();
    }


}
