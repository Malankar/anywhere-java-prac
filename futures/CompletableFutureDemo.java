package futures;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
  public static void main(String[] args) {
    CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      return "Result 1";
    });
    CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      return "Result 2";
    });
    CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      return "Result 3";
    });
    try {
      String result1 = future1.get();
      String result2 = future2.get();
      String result3 = future3.get();
      System.out.println(result1);
      System.out.println(result2);
      System.out.println(result3);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
