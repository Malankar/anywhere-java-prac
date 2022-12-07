package threads;

class Printer {
  // void printDocuments(int numOfCopies, String docName) {
  synchronized void printDocuments(int numOfCopies, String docName) {
    for (int i = 1; i <= numOfCopies; i++) {
      System.out.println(">> Printing " + docName + " " + i);
    }
  }
}

class MyThread extends Thread {
  Printer pRef;

  MyThread(Printer p) {
    pRef = p;
  }

  public void run() {
    // synchronized (pRef) {
    //   pRef.printDocuments(10, "JohnProfile.pdf");
    // }
    pRef.printDocuments(10, "JohnProfile.pdf");
  }
}

class YourThread extends Thread {
  Printer pRef;

  YourThread(Printer p) {
    pRef = p;
  }

  public void run() {
    // synchronized (pRef) {
    //   pRef.printDocuments(10, "AvdhutProfile.pdf");
    // }
    pRef.printDocuments(10, "AvdhutProfile.pdf");
  }
}

public class SyncApp {
  public static void main(String[] args) {
    System.out.println("==Application Started==");

    Printer printer = new Printer();
    // printer.printDocuments(10, "AvdhutProfile.pdf");
    MyThread mRef = new MyThread(printer);
    YourThread yRef = new YourThread(printer);
    mRef.start();
    yRef.start();
    System.out.println("==Application Finished==");
  }
}
