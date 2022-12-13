package collectionclass.mapeg;

import java.util.LinkedHashMap;

public class LinkedHashMapEg {
  public static void main(String[] args) {
    LinkedHashMap<String, String> history = new LinkedHashMap<>();

    history.put("Wikipedia, the free encyclopedia", "https://en.wikipedia.org/");
    history.put("Google", "https://www.google.com/");
    history.put("Facebook - Log In or Sign Up", "https://www.facebook.com/");
    history.put("YouTube", "https://www.youtube.com/");
    
    for (String url : history.keySet()) {
      String title = history.get(url);
      System.out.println(url + " - " + title);
    }
  }
}
