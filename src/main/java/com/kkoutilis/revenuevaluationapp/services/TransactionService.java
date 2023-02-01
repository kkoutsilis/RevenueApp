package com.kkoutilis.revenuevaluationapp.services;

import com.kkoutilis.revenuevaluationapp.models.Transaction;
import com.kkoutilis.revenuevaluationapp.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    private final TransactionRepository repository;

    @Autowired
    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    public List<Transaction> getAll() {
        return repository.findAll();
    }

    public Transaction create(Transaction transaction) {
        this.repository.save(transaction);
        return transaction;
    }
}
