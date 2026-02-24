import java.util.Scanner;

/**
 * GroceryManagement class to manage and display grocery inventory
 * CS3354 - Object-Oriented Programming
 */

public class GroceryManagement {
    /**
     * Method to print the inventory of grocery items
     * @param names array of item names
     * @param prices array of item prices
     * @param stocks array of item stock quantities
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println("Name: " + names[i]); //prints the name
                System.out.println("Price: $" + prices[i]); //prints the price
                System.out.println("Stock: " + stocks[i]); //prints the stock
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        //arrays to hold the inventory data
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        //example data for the inventory
        itemNames[0] = "Apple";
        itemPrices[0] = 0.99;
        itemStocks[0] = 100;
        itemNames[1] = "Banana";
        itemPrices[1] = 0.59;
        itemStocks[1] = 150;

        // create a Menu object to display the menu options
        Menu myMenu = new Menu();

        // Scanner object to read user input from the console
        Scanner userInput = new Scanner(System.in);

        while (true) {
            // display the menu options to the user
            myMenu.printMenu();

            // read the user's choice from the console
            int choice = userInput.nextInt();

            // process the user's choice and perform the corresponding action
            if (choice == 1) {

                // call the printInventory method to display the current inventory of grocery
                // items
                printInventory(itemNames, itemPrices, itemStocks);
            } else if (choice == 2) {
                userInput.nextLine(); // clean up

                System.out.println("Enter Your Target: ");
                String targetName = userInput.nextLine();

                System.out.print("To increase amount (int): ");
                int increaseByAmount = userInput.nextInt();

                // call the Restock class's restockItem method to update the stock of the
                // specified item
                Restock.restockItem(itemNames, itemStocks, targetName, increaseByAmount);
            } else if (choice == 3) {
                System.out.println("Byee....");
                break;
            } else {
                System.out.println("Invalid Input. Choose from Menu.");
            }
        }

        userInput.close();
    }
}