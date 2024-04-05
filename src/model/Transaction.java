import java.time.LocalDate;

public class Transaction {
    private int id;
    private double amount;
    private String category;
    private String description;
    private LocalDate date;

    public Transaction(int id, double amount, String category, String description, LocalDate date) {
        this.id = id;
        this.amount = amount;
        this.category = category;
        this.description = description;
        this.date = date;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
