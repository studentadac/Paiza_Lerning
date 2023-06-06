//言語：Java
//問題URL：https://paiza.jp/works/mondai/prob60/sort_add_9
//コメント：参考 https://dabiyone.com/java/jv00004a.html TreeMapで逆順の項

//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        var map = new HashMap<String,Integer>();
        for (int i=0;i<n ;i++ ) 
        {
            String s=sc.next();
            int num=sc.nextInt();
            map.put(s,map.get(s)==null?num:num+map.get(s)     );
            
        }
        
       
        var sortMap = new TreeMap<Integer,String>(Collections.reverseOrder());;
        
       for (var entry : map.entrySet()) {
            sortMap.put( entry.getValue(),entry.getKey());
        }
      
          
       for (var entry : sortMap.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
        
        
        
    }
}
//```