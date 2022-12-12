package collectionclass.mapeg;

import java.util.HashMap;

/* 
 * In this example, we create a HashMap called counts to store the word counts. We then split the document into words using the split() method and loop through each word. For each word, we check if it is already in the HashMap using the containsKey() method. If it is, we increment its count by calling the put() method and adding 1 to its current count. If it is not, we add it to the HashMap with a count of 1. Finally, we loop through the keys in the HashMap and print each word and its count to the console.
 */
public class HashMapEg {
  public static void main(String[] args) {
    HashMap<String, Integer> counts = new HashMap<>();

    String document = "the quick brown fox jumps over the lazy dog";
    String[] words = document.split(" ");

    for (String word : words) {
      if (counts.containsKey(word)) {
        counts.put(word, counts.get(word) + 1);
      } else {
        counts.put(word, 1);
      }
    }

    for (String word : counts.keySet()) {
      System.out.println(word + ": " + counts.get(word));
    }
  }
}
