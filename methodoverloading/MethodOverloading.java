package methodoverloading;

public class MethodOverloading {
  String name;
  private MethodOverloading(String name){
    this.name=name;
  }
  private static void show(){
    System.out.println("User : Avdhut \t User : Malankar");
  }
  void show(MethodOverloading user){
    System.out.println("User : "+user.name);
  }
  public static void main(String[] args) {
    MethodOverloading newUser=new MethodOverloading("Avdhut");
    MethodOverloading.show();
    newUser.show(newUser);
  }
}
