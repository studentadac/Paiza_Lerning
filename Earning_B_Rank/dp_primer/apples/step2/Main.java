//言語：Java
//問題URL：https://paiza.jp/works/mondai/dp_primer/dp_primer_apples_step2
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var n = sc.nextInt();
        var x = sc.nextInt();
        var a = sc.nextInt();
        var y = sc.nextInt();
        var b = sc.nextInt();
        
        int[] dp=new int[n+x+y];
        for (int i=0;i<=x ;i++ ) 
        {
            
            dp[i]=Math.min(a,b);
            
        }
        
  for (int i=x+1;i<=y ;i++ ) 
        {
            dp[i]=Math.min(a*(1+(i/x)),b);
            
        }

      
        for (int i = y+1; i < n+x+y; i++) {

            dp[i] = Math.min(dp[i-x] + a,dp[i-y] + b);

        }
        System.out.println(dp[n]);
    }

}

//```