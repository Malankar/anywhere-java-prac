import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

public class ParallelCustomized {
  public static void main(String[] args) {
    final int parallelism = 4;
    ForkJoinPool forkJoinPool = null;
    try {
      forkJoinPool = new ForkJoinPool(parallelism);
      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
      final Integer primes = forkJoinPool.submit(() ->
      // Parallel task here, for example
      numbers.parallelStream()
        .mapToInt(n -> n)
        .sum()
          ).get();
      System.out.println(primes);
    } catch (InterruptedException | ExecutionException e) {
      throw new RuntimeException(e);
    }
  }
}
