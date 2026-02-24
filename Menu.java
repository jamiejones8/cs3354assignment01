/**
 * Menu class for the Grocery Management system.
 * Responsible for displaying the main menu options to the user.
 */
class Menu {

    /**
     * Prints the main menu with available options for the user.
     * Options include viewing stock, restocking items, and exiting the application.
     * 
     * @return void - no return value
     */
    public void printMenu() {
        System.out.println("Grocery Management Menu");
        System.out.println("1. View Stock");
        System.out.println("2. Restock");
        System.out.println("3. Exit");
    }
}