//言語：Java
//問題URL：https://paiza.jp/works/mondai/sequence_search_problems_advanced/sequence_search_problems_advanced__strings_boss
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
   
     Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();
     int m=sc.nextInt();
     int k=sc.nextInt()-1;
     int x=sc.nextInt();
     for (int i=0;i<n ;i++ )
     {
     String[] s=sc.next().split(",");
     
     if(Integer.parseInt(s[k])>=x)
     System.out.println(String.join(",",s));
     }
    }
}
//```