package variablescope;

public class MemberVariable {
  /* 
   * All variables defined directly inside a class are member variables
   */
  int a;
  private String b;
  void method1(String b) {
    this.b=b;
    System.out.println(this.b);
  };
}
