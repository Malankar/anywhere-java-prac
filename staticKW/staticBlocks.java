package staticKW;

public class staticBlocks {
  static int a = 23;
  static int b;
  static int max;

  // static blocks
  static {
    System.out.println("First Static block.");
    b = a * 4;
  }
  static {
    System.out.println("Second Static block.");
    max = 30;
  }

  // static method
  static void display() {
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("max = " + max);
  }

  public static void main(String args[]) {
    /* 
     * static block is executed when you call a static method or use a static variable or create an object of the class.
     * staticBlocks obj=new staticBlocks();
     * staticBlocks.display();
     * System.out.println(staticBlocks.a);
     * will give same output.
    */
    staticBlocks.display();

  }
}
