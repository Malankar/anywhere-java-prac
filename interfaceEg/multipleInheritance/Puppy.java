package interfaceEg.multipleInheritance;

public class Puppy implements Animals, Dog {
  public void eats() {
    System.out.println("Puppy eats");
  }

  public void barks() {
    System.out.println("woof woof");
  }
}
