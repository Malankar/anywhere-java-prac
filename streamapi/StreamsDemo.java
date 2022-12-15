import java.util.Arrays;
import java.util.List;
/* 
 * In this code,the filter method filter odd numbers then the map operation is applied to each number in the stream, transforming odd number by squaring it. The reduce operation is then used to reduce the stream to a single integer by summing the numbers.
 * Because the Stream API uses lazy evaluation, the map operation will only be performed on the numbers in the stream that are actually needed by the reduce operation. This means that the map operation will not be performed on even numbers that are not required to calculate the final result.  
 */
public class StreamsDemo {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    int sumOfSquares = numbers.stream()
        .filter(n -> n % 2 == 1)
        .map(n -> n * n) // Transform odd numbers in the stream by squaring it
        .reduce(0, (a, b) -> a + b); // Reduce the stream to a single int by summing the numbers

    System.out.println("Sum of squares: " + sumOfSquares);

  }
}
