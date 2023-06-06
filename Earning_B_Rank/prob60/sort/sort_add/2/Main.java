//言語：Java
//問題URL：https://paiza.jp/works/mondai/prob60/sort_add_2
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
      
      String[] list={"HND", "NRT", "KIX", "NGO", "NGO", "NGO", "NGO", "NGO"};
      
      
      Set<String> items = new HashSet<>(Arrays.asList(list));
      
      System.out.println( list.length  -items.size() +1         );//2つ以上同じ要素が出現するのは、1種類の文字列についてだけです。
      //set itemsの中に一つNGOが入っている
      

      
    }
}
//```