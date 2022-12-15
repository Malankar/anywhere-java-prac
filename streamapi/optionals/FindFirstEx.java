package optionals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstEx {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("apple", "banana", "orange");

    // Find the first word that starts with "b"
    Optional<String> firstWord = words.stream()
        .filter(s -> s.startsWith("b"))
        .findFirst();

    // If a value is present, print it
    String firstWordWithB = firstWord.orElse("No word found that starts with 'b'");
    System.out.println();
    System.out.println(firstWordWithB);

  }
}
