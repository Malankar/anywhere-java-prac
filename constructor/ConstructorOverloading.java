package constructor;

public class ConstructorOverloading {
  String language;

  ConstructorOverloading() {
    this.language = "Java";
  }

  ConstructorOverloading(String language) {
    this.language = language;
  }

  public void getName() {
    System.out.println("Programming Language: " + this.language);
  }

  public static void main(String[] args) {
    ConstructorOverloading obj = new ConstructorOverloading();
    ConstructorOverloading obj2 = new ConstructorOverloading("Python");
    obj.getName();
    obj2.getName();

  }

}
