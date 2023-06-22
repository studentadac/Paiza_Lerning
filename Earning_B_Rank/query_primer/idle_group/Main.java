//言語：Java
//問題URL：https://paiza.jp/works/mondai/query_primer/query_primer__idle_group
//コメント： 
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        
        TreeSet<String> ts = new TreeSet<String>();
        
        for (int i=0;i<n ;i++ )
        {
            String s=sc.next();
           ts.add(s); 
        }
        
           for (int i=0;i<h ;i++ )
        {
            String s=sc.next();
            switch(s)
            {
                
                case "handshake" -> {for( var name:ts)System.out.println(name);}
                case "leave"-> {String name=sc.next();  ts.remove(name);          }
                case "join"-> {String name=sc.next();  ts.add(name);          }
            }
            
            
            
        
        }
        
    }
}
//```