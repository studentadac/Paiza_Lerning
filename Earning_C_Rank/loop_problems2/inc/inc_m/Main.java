//言語：java
//問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__inc_m
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
         int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt();
         sc.close();
         int ans=0;
         
         while( n<=k      )
         {
             ans++;
             n+=m;
         }
         System.out.println(ans);
      
    }
}
//```