package collectionclass.linkedlisteg;

import java.util.LinkedList;

/* 
 * Suppose you are building a game where players can move around a virtual world and pick up items. You could use a linked list to store the items that each player has picked up. As the player moves around and picks up new items, you can add them to the end of their linked list. When the player uses an item, you can remove it from the linked list using its position in the list. This would allow you to easily keep track of the order in which the player picked up the items, and use that information to determine how the game should progress.
 */
public class LinkedListDemo {
  public static void main(String[] args) {
    LinkedList<String> inventory = new LinkedList<>();
    // Add some items to the player's inventory
    inventory.add("Sword");
    inventory.add("Shield");
    inventory.add("Health potion");

    // Print the contents of the inventory
    for (int i = 0; i < inventory.size(); i++) {
      System.out.println("Item " + (i + 1) + ": " + inventory.get(i));
    }
    // Use the first item in the inventory (the "Sword")
    String usedItem = inventory.remove(0);
    System.out.println("Used item: " + usedItem);

    // Print the updated contents of the inventory
    System.out.println("Updated inventory:");
    for (int i = 0; i < inventory.size(); i++) {
      System.out.println("Item " + (i + 1) + ": " + inventory.get(i));
    }
  }
}
