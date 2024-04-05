import java.util.Scanner;

public class MainView {
    private Scanner scanner;

    public MainView() {
        this.scanner = new Scanner(System.in);
    }

    public void showMainMenu() {
        System.out.println("Personal Finance Manager");
        System.out.println("1. Add Transaction");
        System.out.println("2. View Transactions");
        // Add more options as needed
        System.out.println("0. Exit");
    }

    public int getUserChoice() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    // You can add more methods to get user input for different functionalities
}
