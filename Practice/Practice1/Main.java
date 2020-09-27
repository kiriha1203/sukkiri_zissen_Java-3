package Practice.Practice1;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    var h1 = new Hero("斎藤");
    var h2 = new Hero("鈴木");

    List<Hero> heros = new ArrayList<>();
    heros.add(h1);
    heros.add(h2);
    
    for (Hero h : heros) {
      System.out.println(h.getName());
    }
  }
  
}