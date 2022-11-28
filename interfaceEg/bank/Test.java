package interfaceEg.bank;

public class Test {
  public static void main(String[] args) {
    Bank b = new SBI();
    System.out.println("Rate of Interest of SBI is: " + b.rateOfInterest());
    Bank c = new PNB();
    System.out.println("Rate of Interest of PNB is: " + c.rateOfInterest());
  }
}
