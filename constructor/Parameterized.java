package constructor;

public class Parameterized {
  String languages;

  // constructor accepting single value
  Parameterized(String lang) {
    this.languages = lang;
    System.out.println(languages + " Programming Language");
  }

  public static void main(String[] args) {
    Parameterized obj1 = new Parameterized("Java");
    Parameterized obj2 = new Parameterized("Python");
    Parameterized obj3 = new Parameterized("C");
    System.out.println("Languages mentioned are: " + obj1.languages + ", " + obj2.languages + ", " + obj3.languages);
  }
}
