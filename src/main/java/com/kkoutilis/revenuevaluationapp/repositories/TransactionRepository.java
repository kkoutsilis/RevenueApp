package com.kkoutilis.revenuevaluationapp.repositories;

import com.kkoutilis.revenuevaluationapp.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface TransactionRepository extends JpaRepository<Transaction, UUID> {
}
