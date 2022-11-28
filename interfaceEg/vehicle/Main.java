package interfaceEg.vehicle;

public class Main {
  public static void main(String[] args) {
    Bicycle bicycle = new Bicycle();
    bicycle.changeGear(2);
    bicycle.speedUp(3);
    bicycle.applyBrakes(1);
    System.out.println("This bicycle is made by: " + Vehicle.manufacturer);

    System.out.println("Bicycle present state :");
    bicycle.printStates();

    Bike bike = new Bike();
    bike.changeGear(1);
    bike.speedUp(4);
    bike.applyBrakes(3);

    System.out.println("This bike is made by: " + Vehicle.manufacturer);
    System.out.println("Bike present state :");
    bike.printStates();

  }
}
