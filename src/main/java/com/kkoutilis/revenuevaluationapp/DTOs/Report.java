package com.kkoutilis.revenuevaluationapp.DTOs;

public class Report {
    private float income;
    private float expenses;
    private float revenue;

    public Report(float income, float expenses, float revenue) {
        this.income = income;
        this.expenses = expenses;
        this.revenue = revenue;
    }

    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }

    public float getExpenses() {
        return expenses;
    }

    public void setExpenses(float expenses) {
        this.expenses = expenses;
    }

    public float getRevenue() {
        return revenue;
    }

    public void setRevenue(float revenue) {
        this.revenue = revenue;
    }
}
