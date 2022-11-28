package staticKW;

class Company {
  //static variable
  static int employees = 400000;
  
  //static method
  public static void companyName() {
    System.out.println("Anywhere Works");
  }
}

public class StaticEg {
  public static void main(String[] args) {
    //calling static method
    Company.companyName();
    //calling static variable
    System.out.println("Employees: " + Company.employees);
  }
}
