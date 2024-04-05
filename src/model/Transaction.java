package model;

import java.time.LocalDate;

public class Transaction {
    private static int idCounter = 0; // Simple ID counter for example purposes
    private int id;
    private double amount;
    private String category;
    private String description;
    private LocalDate date;

    public Transaction(int id, double amount, String category, String description, LocalDate date) {
        this.id = idCounter++; // Increment ID for each new transaction
        this.amount = amount;
        this.category = category;
        this.description = description;
        this.date = date;
    }

    // Getters and setters for each field go here

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", amount=" + amount +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}
