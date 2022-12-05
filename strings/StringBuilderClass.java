package strings;

public class StringBuilderClass {
  StringBuilder str = new StringBuilder("some string,");

  public static void main(String[] args) {
    StringBufferClass obj = new StringBufferClass();
    System.out.println(obj.str.append(" this string is appended"));
  }
}
