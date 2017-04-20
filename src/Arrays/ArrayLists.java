package Arrays;

import java.util.ArrayList;

/**
 * Created by jeremy.shefer on 4/19/17.
 */
public class ArrayLists {
    private ArrayList<String> groceryList = new ArrayList<String>();

    private void addGroceryItem(String item) {
        groceryList.add(item);

    }

    private void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your list.");

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    private void modifyGroceryItem() {
        groceryList.set(0, "Goodbye");
    }

    private String findItem(String searchItem) {
        boolean exists = groceryList.contains(searchItem);
        return exists ? "Contains" : "Does not contain";
    }

    public void Run() {
        addGroceryItem("Milk");
        printGroceryList();
        modifyGroceryItem();
        printGroceryList();
        findItem("Milk");
    }
}
