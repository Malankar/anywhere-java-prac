package futures;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableDemo {
  public static void main(String[] args) {

    Runnable task = () -> {

      try {
        Thread.sleep(1000);

      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("Task complete!");
    };

    ExecutorService executor = Executors.newSingleThreadExecutor();

    executor.submit(task);

    System.out.println("Doing other work...");
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    executor.shutdown();

  }
}
