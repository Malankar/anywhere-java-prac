package collectionclass;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
  public static void main(String[] args) {
    Collection<Integer> obj=new ArrayList<>();
    obj.add(1);
    obj.add(2);
    obj.add(3);
    System.out.println(obj);
  }
}
