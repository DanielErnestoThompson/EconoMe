package controller;

import model.Transaction;
import view.MainView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MainController {

    private MainView mainView;
    private List<Transaction> transactions; // In-memory storage for simplicity

    public MainController() {
        this.mainView = new MainView();
        this.transactions = new ArrayList<>();

        mainView.addSubmitAction(e -> submitTransaction());
    }

    public void startApplication() {
        mainView.display();
    }

    private void submitTransaction() {
        try {
            // Parse amount as double, if this fails, an exception will be thrown
            double amount = Double.parseDouble(mainView.getAmount());
            String category = mainView.getCategory();
            String description = mainView.getDescription();

            // Create transaction and add it to the list
            Transaction transaction = new Transaction(0, amount, category, description, LocalDate.now());
            transactions.add(transaction);
            System.out.println("Transaction added: " + transaction);

            // Clear the form fields
            mainView.clearForm();

            // Here you would refresh the view to show the added transaction
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter a valid amount.");
        }
    }

    // Additional methods for application logic go here
}
