package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainView {
    private JFrame frame;
    private JTextField amountField;
    private JTextField categoryField;
    private JTextField descriptionField;
    private JButton submitButton;

    public MainView() {
        frame = new JFrame("Finance Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(0, 2)); // Simple grid layout

        // Add form fields and labels
        frame.add(new JLabel("Amount:"));
        amountField = new JTextField();
        frame.add(amountField);

        frame.add(new JLabel("Category:"));
        categoryField = new JTextField();
        frame.add(categoryField);

        frame.add(new JLabel("Description:"));
        descriptionField = new JTextField();
        frame.add(descriptionField);

        // Add submit button
        submitButton = new JButton("Add Transaction");
        frame.add(submitButton);
    }

    public void display() {
        frame.pack();
        frame.setLocationRelativeTo(null); // Center the window
        frame.setVisible(true);
    }

    public void addSubmitAction(ActionListener actionListener) {
        submitButton.addActionListener(actionListener);
    }

    public String getAmount() {
        return amountField.getText();
    }

    public String getCategory() {
        return categoryField.getText();
    }

    public String getDescription() {
        return descriptionField.getText();
    }

    public void clearForm() {
        // Clear the text fields after submission
        amountField.setText("");
        categoryField.setText("");
        descriptionField.setText("");
    }
}
