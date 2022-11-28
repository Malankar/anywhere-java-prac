package interfaceEg.bank;

public interface Bank {
  // This feature of default was introduced in JDK8
  default float rateOfInterest() {
    return 9.5f;
  };
}
