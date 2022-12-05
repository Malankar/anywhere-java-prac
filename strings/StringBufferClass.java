package strings;

/* 
 * This string is thread safe, means many changes can be made at the same time and they will not overlap
 */
public class StringBufferClass {
  StringBuilder str = new StringBuilder("some string,");

  public static void main(String[] args) {
    StringBufferClass obj = new StringBufferClass();
    System.out.println(obj.str.append(" this string is appended"));
  }
}
