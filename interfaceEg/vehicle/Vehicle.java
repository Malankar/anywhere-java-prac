package interfaceEg.vehicle;

/*
 * Various Vehicle can have different gear but every Vehicle should have a way to change Gear 
 * or speed up or apply brakes that why we are using interface as we can change the implementation 
 * later on. We could have used abstract classes but interface provides more control over the 
 * abstraction as the methods are public and fields are public static & final.
*/
public interface Vehicle {
  String manufacturer = "Honda";

  void changeGear(int a);

  void speedUp(int a);

  void applyBrakes(int a);
}
