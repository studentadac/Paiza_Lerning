//言語：Java
//問題URL：https://paiza.jp/works/mondai/query_primer/query_primer__map_normal
//コメント： 
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
       String a[]=new String[1000001 ];
        Scanner sc = new Scanner(System.in);
        
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
       for (int i=0;i<n ;i++ )
       {
           int id=sc.nextInt();
           String name=sc.next();
           a[id]=name;
       }
         for (int i=0;i<k ;i++ )
       {
           String order=sc.next();
           int id=sc.nextInt();
           switch(order)
           {
           
           case "call" ->System.out.println(a[id]);
           case "join"-> a[id] =sc.next();
               
           }
       }
    }
}
//```