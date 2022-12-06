package exceptionhandling;

public class ExceptionHandling {
  public static void main(String[] args) {
    try {
      int myInt = Integer.parseInt("null ");
      System.out.println(myInt);
    } catch (NumberFormatException | NullPointerException e) {
      System.out.println("Number is non numeric string! Pass a number");
      System.out.println(e);
    } finally { // always execute
      System.out.println("This is finally block");
    }

  }
}
