//言語：Java
//問題URL：https://paiza.jp/works/mondai/prob60/sort_add_1
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
      
      String s="HND, NRT, KIX, NGO, NGO";
      String[] list=s.split(", ");
      
      
      Set<String> items = new HashSet<>(Arrays.asList(list));
      
      System.out.println( list.length  !=items.size()          );
      
      

      
    }
}
//```