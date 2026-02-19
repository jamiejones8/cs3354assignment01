/*
* Restocks an item in the inventory
* Searches for the target item name and increases its stock by one if found
* If not found, prints "Item not found"
*/

public static void restockItem(String[] names, int[] stocks, String target, int amount){

    // False is default state
    boolean found = false;

    // Iterates through names array to find target, increments by amount and breaks when found
    for(int i = 0; i < names.length; i++){
        if (names[i] != null && names[i].equals(target)){
            stocks[i] += amount;
            System.out.println(target + " restocked successfully");
            found = true;
            break;
        }
    }

    // If bool found stays false, print target not found.
    if(found == false){
        System.out.println(target + " not found.");
    }
}
