package collectionclass.mapeg;

import java.util.TreeMap;

/* 
 * Storing a dictionary, where the words are the keys and the definitions are the values. A TreeMap would allow you to maintain the order of the words, such as alphabetical order, making it easy to look up a word and its definition in a specific order.
 */
public class TreeMapEg {
  public static void main(String[] args) {
    TreeMap<String, String> dictionary = new TreeMap<>();

    dictionary.put("hello", "a greeting");
    dictionary.put("world", "the earth and all life on it");
    dictionary.put("apple", "a round fruit with red or green skin");
    dictionary.put("computer", "an electronic device for storing and processing data");
    dictionary.put("book", "a written or printed work consisting of pages bound together");
    dictionary.forEach((key, value) -> System.out.println(key + " : " + value));

    System.out.println("\nFinding a Particular definition");
    String word = "book";
    String definition = dictionary.get(word);
    System.out.println(word + ": " + definition);
  }
}
