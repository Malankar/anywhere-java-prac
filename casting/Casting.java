package casting;

public class Casting {
  public static void main(String[] args) {
    Animal myDog = new Dog();
    // doAnimalStuff(myDog);
    doAnimalStuffDown(myDog);
  }
  public static void doAnimalStuff(Animal animal){
    animal.makeNoise();
  }
  public static void doAnimalStuffDown(Animal animal){
    animal.makeNoise();
    if(animal instanceof Dog){
      Dog myDog= (Dog) animal;
      myDog.growl();
    }
  }
}
