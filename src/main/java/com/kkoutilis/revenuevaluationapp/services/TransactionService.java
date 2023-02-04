package com.kkoutilis.revenuevaluationapp.services;

import com.kkoutilis.revenuevaluationapp.DTOs.Report;
import com.kkoutilis.revenuevaluationapp.models.Transaction;
import com.kkoutilis.revenuevaluationapp.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

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

    public boolean delete(UUID id) {
        Transaction transaction = this.repository.findById(id).orElseThrow();
        this.repository.delete(transaction);
        return true;
    }

    public Report calcReport() {
        float income = this.repository.getIncomeSum();
        float expenses = this.repository.getExpensesSum();
        float revenue = income - expenses;
        return new Report(income, expenses, revenue);
    }
}
