package threads;

// mytask is a thread.
class MyTask implements Runnable {
  public void run() {
    for (int doc = 1; doc <= 10; doc++) {
      System.out.println("@ Printing Document #" + doc + " - Printer2");
    }
  }

}

public class App {
  // main method represents main thread.
  public static void main(String[] args) {
    /*
     * whatever we write here will be executed by main thread
     * thread always execute the jobs in a sequence
     * Thread is an Execution context means it will execute code in sequence
     */
    // Job1
    System.out.println("==Application Started==");

    // Job 2
    Runnable r = new MyTask();
    Thread task = new Thread(r);
    task.start();
    /*
     * Now, main and myTask are executing both parallely or corcurrenlty.
     */

    // Job 3
    for (int doc = 1; doc < 10; doc++) {
      System.out.println("@ Printing Document #" + doc + " - Printer1");
    }

    System.out.println("==Application Finished==");
  }
}
