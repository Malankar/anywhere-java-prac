package futures;

import java.util.concurrent.CompletableFuture;

public class NestesCompletableDemo {

  public static void main(String[] args) {

    CompletableFuture<String> task1 = CompletableFuture.supplyAsync(() -> {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {

      }
      return "Task 1 result";
    });
    CompletableFuture<String> task2 = CompletableFuture.supplyAsync(() -> {
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {

      }
      return "Task 2 result";
    });

    CompletableFuture<String> combined = task1.thenCombine(task2, (r1, r2) -> {
      return "Combined result: " + r1 + ", " + r2;
    });

    System.out.println(combined.join());
  }
}
