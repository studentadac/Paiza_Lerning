//言語：Java
//問題URL：https://paiza.jp/works/mondai/dp_primer/dp_primer_apples_step0
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

         var n = sc.nextInt();
         var a = sc.nextInt();
         var b = sc.nextInt();   

         
         int[] dp=new int[n+1];
       
    
    dp[0] = 0;
    dp[1]=a;

    for (int i = 2; i <= n; i++) {

        dp[i] = Math.min(dp[i-1] + a, dp[i-2] + b);

      
      
    }

         System.out.println(dp[n]);
          
         
    }
}

//```