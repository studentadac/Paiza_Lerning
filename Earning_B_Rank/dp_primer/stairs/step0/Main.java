//言語：Java
//問題URL：https://paiza.jp/works/mondai/dp_primer/dp_primer_stairs_step0
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

         var n = sc.nextInt();
         
         int[] dp=new int[n+1];
         dp[0]=1;
         for (int i=1;i<=n ;i++ ) 
         {
             if(i>=1)
             dp[i]=dp[i]+dp[i-1];
             if(i>=2)
             dp[i] = dp[i] + dp[i-2] ;
         }
         
         System.out.println(dp[n]);
         
         
         
    }
}

/*dp[0] <- 1

for i = 1 to n
    dp[i] <- 0
    if i >= 1 then
        dp[i] <- dp[i] + dp[i-1]    // i-1 段目から1段上って i 段へ到達
    if i >= 2 then
        dp[i] <- dp[i] + dp[i-2]    // i-2 段目から2段上って i 段へ到達

print dp[n]*/

//```