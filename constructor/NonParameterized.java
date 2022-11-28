package constructor;

public class NonParameterized {
  int i;

  private NonParameterized() {
    i = 5;
    System.out.println("Constructor is called");
  }

  public static void main(String[] args) {
    NonParameterized test = new NonParameterized();
    System.out.println("Value of i is: " + test.i);
  }
}
