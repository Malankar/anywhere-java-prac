package constructor;

public class DefaultCons {
  int a;
  boolean b;

  public static void main(String[] args) {
    DefaultCons test = new DefaultCons();
    System.out.println("Default Value:");
    System.out.println("a = " + test.a);
    System.out.println("b = " + test.b);
  }
}
