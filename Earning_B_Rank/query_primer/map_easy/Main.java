//言語：Java
//問題URL：https://paiza.jp/works/mondai/query_primer/query_primer__map_easy
//コメント： 
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
       String a[]=new String[10001];
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
           int id=sc.nextInt();
           System.out.println(a[id]);
       }
    }
}
//```