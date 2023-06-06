//言語：Java
//問題URL：https://paiza.jp/works/mondai/prob60/fortune_telling_1
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
          Scanner sc = new Scanner(System.in);
        
        final int n=sc.nextInt();
        var map=new LinkedHashMap<String,String>(n);
        
        for (int i=0;i<n ;i++ ) 
        {
            map.put(sc.next(),sc.next());
            
        }
           
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
//```