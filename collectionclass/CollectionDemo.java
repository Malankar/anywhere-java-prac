package collectionclass;

/* 
 * ArrayList extends AbstractList class which extends Abstract collection class which implements Collection Interface
 */
import java.util.ArrayList; 
import java.util.Collections;

public class CollectionDemo {
  public static void main(String[] args) {
    ArrayList<String> obj=new ArrayList<>();
    obj.add("hello");
    obj.add("world");
    obj.add("foo");
    obj.add("bar");
    System.out.println(obj.get(2));
    Collections.sort(obj);
    System.out.println(obj);
  }
}
