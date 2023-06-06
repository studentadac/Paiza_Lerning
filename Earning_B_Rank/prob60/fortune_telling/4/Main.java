//言語：Java
//問題URL：https://paiza.jp/works/mondai/prob60/fortune_telling_4
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
          Scanner sc = new Scanner(System.in);
        String s=sc.next();
        final int n=sc.nextInt();
        var map=new LinkedHashMap<String,String>(n);
        
        for (int i=0;i<n ;i++ ) 
        {
            map.put(sc.next(),sc.next());
            
        }
           
        final int n2=sc.nextInt();
        var map2=new LinkedHashMap<String,String>(n2);
        
        for (int i=0;i<n2 ;i++ ) 
        {
            map2.put(sc.next(),sc.next());
            
        }
        
        
        
        
           
       
            System.out.println(   map2.get( map.get(s))       ) ;
        

    }
}
//```