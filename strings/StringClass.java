package strings;

public class StringClass {
  public static void main(String[] args) {
    // declare java string with a string literal
    String str = "A string literal";
    String str2 = "A string literal";
    System.out.println(str==str2);//true // This happens because str2 just references str and does not create new object.
    System.out.println("String str = " + str);
    
    // declare string using new operator
    String strNew = new String("Using new operator");
    String strNew2 = new String("Using new operator");
    
    System.out.println(strNew==strNew2);//false //This happens because a new object is created via new keyword
    System.out.println(strNew.equals(strNew2));//true
    System.out.println("String strNew = " + strNew);
  }
}
