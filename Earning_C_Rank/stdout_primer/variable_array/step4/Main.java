//言語：java
//問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__variable_array_step4
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
       final int n=sc.nextInt();
    
       for(int i=1;i<=n;i++)
       {
           int m=sc.nextInt();
        for(int j=1;j<=m;j++)
        {
          System.out.print(j);
          
          if(j!=m)
          System.out.print(" ");
          else
          System.out.println("");
            
        }
        
        
       }
    
    }
}
//```