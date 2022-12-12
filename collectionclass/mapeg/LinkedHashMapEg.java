package collectionclass.mapeg;

import java.util.LinkedHashMap;

public class LinkedHashMapEg {
  public static void main(String[] args) {
    LinkedHashMap<String, String> history = new LinkedHashMap<>();

    history.put("https://en.wikipedia.org/", "Wikipedia, the free encyclopedia");
    history.put("https://www.google.com/", "Google");
    history.put("https://www.facebook.com/", "Facebook - Log In or Sign Up");
    history.put("https://www.youtube.com/", "YouTube");
    
    for (String url : history.keySet()) {
      String title = history.get(url);
      System.out.println(url + " - " + title);
    }
  }
}
