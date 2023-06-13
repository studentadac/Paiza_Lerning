//言語：Java
//問題URL：https://paiza.jp/works/mondai/dp_primer/dp_primer_apples_step1
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
        
        int[] dp=new int[n+5];
        for (int i = 0; i < n+5; i++) {
            dp[i] = 10000000;
        }


        dp[0] = 0;
        dp[1] = Math.min(a,b);
        dp[2] = Math.min(a,b);
        dp[3] = Math.min(2*a,b);
        dp[4] = Math.min(2*a,b);

        for (int i = 5; i < n+4; i++) {

            dp[i] = Math.min(dp[i-2] + a,dp[i-5] + b);

        }
        System.out.println(dp[n]);
    }

}

//```