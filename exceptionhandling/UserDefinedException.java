package exceptionhandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class MyException extends Exception {
  String str1;

  MyException(String str1) {
    this.str1 = str1;
  }

  @Override
  public String toString() {
    return ("MyException Occurred: " + this.str1);
  }
}

public class UserDefinedException {
  static void givesException() throws ArithmeticException, ArrayIndexOutOfBoundsException {
    int i = 5;
    int j = 1;
    int[] arr = { 1, 2, 3, 4 };
    int k = i / j;
    System.out.println(k);
    System.out.println(arr[2]);
  }

  public void writeToFile() {
    // BufferedWriter bw2 = new BufferedWriter(new FileWriter("myFile.txt"));
    // gives Unhandled exception type IOException
    try (BufferedWriter bw = new BufferedWriter(new FileWriter("myFile.txt"))) {
      bw.write("Test");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String args[]) {
    try {
      givesException();
    } catch (ArithmeticException e) {
      System.out.println(e);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e);
    }
    try {
      System.out.println("Start of try block");
      throw new MyException("Error Message");
    } catch (MyException exp) {
      System.out.println("Catch Block");
      System.out.println(exp);
    }
  }
}
