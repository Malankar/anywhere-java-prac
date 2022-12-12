package collectionclass.setseg;

import java.util.TreeSet;

public class TreeSetEg {
  public static void main(String[] args) {
    // create a tree set
    TreeSet<Integer> set = new TreeSet<>();

    // add elements to the set
    set.add(5);
    set.add(2);
    set.add(3);
    set.add(1);
    set.add(4);

    // check if an element is in the set
    if (set.contains(3)) {
      System.out.println("3 is in the set");
    }

    // remove an element from the set
    set.remove(2);

    System.out.println("Largest Number: "+set.last());

    // print the elements in the set in ascending order
    for (int element : set) {
      System.out.println(element);
    }

  }
}
