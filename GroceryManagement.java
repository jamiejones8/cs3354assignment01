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
        printInventory(itemNames, itemPrices, itemStocks); //calls the method to print the inventory
    }
}