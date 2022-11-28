package constructor;

public class OneConstructorFromAnother {
  int sum;

  OneConstructorFromAnother() {
    this(5, 2);
  }

  OneConstructorFromAnother(int a, int b) {
    this.sum = a + b;
  }

  void display() {
    System.out.println("Sum is: " + sum);
  }

  public static void main(String[] args) {
    OneConstructorFromAnother obj = new OneConstructorFromAnother();
    obj.display();
    OneConstructorFromAnother obj2 = new OneConstructorFromAnother(2,3);
    obj2.display();
  }
}
