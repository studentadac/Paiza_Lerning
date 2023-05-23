//言語：java
//問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__dict_step3
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        var map = new TreeMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        final int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String s=sc.next();
             if (map.containsKey(s)) {
            map.put(s, map.get(s) + 1);
        } else {
            map.put(s, 1);
        }
        
            
        }
        sc.close();
        
        
        
        for(var entry :  map.entrySet())
         System.out.println(entry.getKey() + " " + entry.getValue());
         
         
    }
}
//```