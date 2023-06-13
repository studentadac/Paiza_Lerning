//言語：Java
//問題URL：https://paiza.jp/works/mondai/dp_primer/dp_primer_stairs_step1
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
       
    if(n>a)
    dp[a] = 1;
    if(n>b)
    dp[b] = 1;
    for (int i = 1; i <= n; i++) {

      if (i >= a) {
        dp[i] += dp[i - a];
      }
      if (i >= b) {
        dp[i] += dp[i - b];
      }
    }
         
         
         
         System.out.println(dp[n]);
          
         
    }
}


//```