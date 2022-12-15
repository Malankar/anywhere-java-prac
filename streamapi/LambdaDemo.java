import java.util.Arrays;
import java.util.List;

/* 
 * Consider a situation where you have a list of strings and you want to sort the list in ascending order by length
 */
@FunctionalInterface
interface StringToIntFunction {
    int apply(String s);
}

public class LambdaDemo {
  public static void main(String[] args) {
    List<String> strings = Arrays.asList("cat", "dog", "bird");
    StringToIntFunction stringToIntFunction = s -> s.length();
    
    strings.sort((s1, s2) -> stringToIntFunction.apply(s1) - stringToIntFunction.apply(s2));
    
    for (String s : strings) {
      System.out.println(s);
  }
  }
}
