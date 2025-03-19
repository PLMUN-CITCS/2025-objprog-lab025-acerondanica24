class Item {
    // Static variable to track the number of objects created
    static int objectCount = 0;

    // Instance variable to store the item name
    String itemName;

    // Constructor to initialize itemName and increment objectCount
    public Item(String itemName) {
        this.itemName = itemName;
        objectCount++; // Increment the static variable
    }

    // Static method to display the total number of objects created
    public static void displayObjectCount() {
        System.out.println("Total objects created: " + objectCount);
    }

    // Instance method to display the item name
    public void displayItem() {
        System.out.println("Item: " + itemName);
    }
}

// Main class containing the main method
public class ItemDemo {
    public static void main(String[] args) {
        // Creating three objects of Item class
        Item item1 = new Item("Laptop");
        Item item2 = new Item("Smartphone");
        Item item3 = new Item("Tablet");

        // Calling instance methods to display item names
        item1.displayItem();
        item2.displayItem();
        item3.displayItem();

        // Calling the static method to display the total number of objects created
        Item.displayObjectCount();
    }
}
