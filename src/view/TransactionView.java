package model;

import java.time.LocalDate;

public class TransactionView {
    private int id;
    private double amount;
    private String category;
    private String description;
    private LocalDate date;

    public TransactionView(int id, double amount, String category, String description, LocalDate date) {
        this.id = id;
        this.amount = amount;
        this.category = category;
        this.description = description;
        this.date = date;
    }

    // Getters and setters for each field go here
}
