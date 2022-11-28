package travels;

import human.Human;
import vehicle.Car;

public class Main {
  public static void main(String[] args) {
    Human h1 = new Human("Avdhut");
    Car c1 = new Car("Ferrari");
    System.out.println(h1.name + " Owns " + c1.name + " and it has " + Car.wheels + " wheels.");
  }
}
