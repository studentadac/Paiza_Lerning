//言語：Java
//問題URL：https://paiza.jp/works/mondai/sequence_search_problems_advanced/sequence_search_problems_advanced__strings_step2
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
   
     Scanner sc = new Scanner(System.in);
     var s=sc.next();
     var t=sc.next();
     int ans=0;
     for (int i=0;i<s.length()-t.length()+1 ;i++ ) 
     {
         
         if(s.substring(i,i+t.length()).equals(t))
         ans++;
         
     }
     System.out.println(ans);
      
    }
}
//```