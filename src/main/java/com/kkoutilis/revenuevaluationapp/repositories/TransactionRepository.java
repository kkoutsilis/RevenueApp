package com.kkoutilis.revenuevaluationapp.repositories;

import com.kkoutilis.revenuevaluationapp.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;


public interface TransactionRepository extends JpaRepository<Transaction, UUID> {

    @Query(value = "SELECT COALESCE(SUM(amount),0) FROM transactions WHERE type = 'income'",nativeQuery = true)
    float getIncomeSum();

    @Query(value = "SELECT COALESCE(SUM(amount),0) FROM transactions WHERE type = 'expense'",nativeQuery = true)
    float getExpensesSum();

}
