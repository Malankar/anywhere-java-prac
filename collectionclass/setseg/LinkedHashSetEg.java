package collectionclass.setseg;

import java.util.LinkedHashSet;

public class LinkedHashSetEg {
  public static void main(String[] args) {
    // Set the maximum size of the cache to 10 items
    int MAX_SIZE = 4;

    // Create a LinkedHashSet
    LinkedHashSet<String> cache = new LinkedHashSet<>(MAX_SIZE);

    // Add some items to the cache
    cache.add("item1");
    cache.add("item2");
    cache.add("item3");

    // Check if an item is in the cache
    if (cache.contains("item2")) {
      System.out.println("item2 is in the cache");
    }

    // Iterate through the items in the order they were added
    for (String item : cache) {
      System.out.println(item);
    }

    // Add more items to the cache until it reaches its maximum size
    cache.add("item4");
    cache.add("item5");

    // If the cache reaches its maximum size, remove the least recently used item
    if (cache.size() >= MAX_SIZE) {
      // In this case, we remove the first item that was added to the cache
      cache.remove(cache.iterator().next());
    }
    System.out.println("After the cache is full");
    for (String item : cache) {
      System.out.println(item);
    }

  }
}
