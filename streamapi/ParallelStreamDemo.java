package streamapi;

import java.util.Arrays;
import java.util.List;
/* 
 *  A list of numbers is created and a parallel stream is created by calling the parallelStream() method on the list. The mapToInt() operation is then performed on the parallel stream, which maps each number in the stream to an integer.
 */
public class ParallelStreamDemo {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // Use a parallel stream to process the numbers in parallel
    int sum = numbers.parallelStream()
        .mapToInt(n -> n)
        .sum();
    System.out.println("Sum: " + sum);
  }
}
