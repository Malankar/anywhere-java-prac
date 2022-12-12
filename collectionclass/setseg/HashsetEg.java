package collectionclass.setseg;

import java.util.HashSet;

/* 
 * While both a hash set and an array list can be used to store a collection of elements, a hash set is better suited for checking the presence of an element, while an array list is better suited for accessing elements by their index. It is also worth noting that a hash set does not store elements in a specific order, while an array list does.
 */
public class HashsetEg {
  public static void main(String[] args) {
    HashSet<String> set = new HashSet<>();

    set.add("apple");
    set.add("banana");
    set.add("orange");

    if (set.contains("apple")) {
      System.out.println("apple is in the set");
    }

    set.remove("banana");

    System.out.println("The set has " + set.size() + " elements");

  }
}
