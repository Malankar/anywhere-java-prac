package casting;

public class Dog extends Animal {
  @Override
  void makeNoise(){
    System.out.println("Woof woof");
  }
  void growl(){
    System.out.println("Grrr");
  }
}
