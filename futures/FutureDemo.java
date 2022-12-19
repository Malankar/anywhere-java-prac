import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {
  public static void main(String[] args) {

    Callable<Integer> task = () -> {

      Thread.sleep(1000);
      return 42;
    };

    ExecutorService executor = Executors.newSingleThreadExecutor();

    Future<Integer> future = executor.submit(task);

    System.out.println("Doing other work...");
    
    try {
      int result = future.get();
      System.out.println("Result: " + result);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }

    executor.shutdown();
  }
}
