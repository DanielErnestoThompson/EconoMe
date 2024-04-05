public class MainController {
    private MainView view;

    public MainController() {
        this.view = new MainView();
    }

    public void startApplication() {
        boolean exit = false;
        while (!exit) {
            view.showMainMenu();
            int choice = view.getUserChoice();
            switch (choice) {
                case 1:
                    // Handle add transaction
                    break;
                case 2:
                    // Handle view transactions
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Methods for handling user actions (add, view transactions) go here
}
