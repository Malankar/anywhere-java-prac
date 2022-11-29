package staticKW;

import java.util.ArrayList;
import java.util.List;

/* 
 * It wouldn't be possible to initialize a List object with all the initial values along with 
 * declaration. So, this is why we've utilized the static block here.
 */
public class staticBlocks {

  public static List<String> ranks = new ArrayList<>();

  static {
    ranks.add("Lieutenant");
    ranks.add("Captain");
    ranks.add("Major");
  }

  {
    ranks.add("Colonel");
    ranks.add("General");
  }

  static void display() {
    System.out.println(ranks);
  }

  public static void main(String args[]) {
    /*
     * static block is executed when you call a static method or use a static
     * variable or create an object of the class.
     * staticBlocks obj=new staticBlocks();
     * staticBlocks.display();
     * System.out.println(staticBlocks.ranks);
     * will give same output.
     */
    staticBlocks.display();
  }
}
