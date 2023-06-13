//言語：Java
//問題URL：https://paiza.jp/works/mondai/dp_primer/dp_primer_apples_boss
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
        var z = sc.nextInt();
        var c = sc.nextInt();

        int[] dp=new int[n+z];
        for (int i=1;i<=x ;i++ ) //条件 a < b < c ,x < y < z
        {
           dp[i]=a;
        }
        
  for (int i=x+1;i<=y ;i++ ) 
        {
            dp[i]=Math.min(a*(1+(i/x)),b);
            
        }



  for (int i=y+1;i<=z ;i++ ) 
        {
            dp[i]=Math.min(a*(1+(i/x)),b *(1+(i/y))  );
            dp[i]=Math.min(c,dp[i]);
        }



        for (int i = z+1; i < n+z; i++) {

            dp[i] = Math.min(dp[i-x] + a,dp[i-y] + b);
            dp[i]=Math.min(dp[i-z] + c,dp[i]);

        }
        System.out.println(dp[n]);
    }

}

//```