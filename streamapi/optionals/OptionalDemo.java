package optionals;

import java.util.Optional;
/* 
 * Suppose we are getting a something from the database and if the data is not present in the database we should handle the null exception. We can use optionals for that as optionals will prompt us to check if the value is null or not while implmenting a specific method.
 */
public class OptionalDemo {

  public static void main(String[] args) {
    Optional<Cat> optionalCat = findCatByName("Fred");
    // if(optionalCat.isPresent()){
    // System.out.println(optionalCat.get().getAge());
    // }else{
    // System.out.println("Your cat is not there!");
    // }
    Cat myCat = optionalCat.orElse(new Cat("UNKNOWN", 0));
    System.out.println(myCat.getName());
  }

  private static Optional<Cat> findCatByName(String name) {
    Cat cat = new Cat(name, 3);
    return Optional.ofNullable(cat);
  }
}
