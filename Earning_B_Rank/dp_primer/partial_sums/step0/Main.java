//言語：Java
//問題URL：https://paiza.jp/works/mondai/dp_primer/dp_primer_partial_sums_step0
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        var n=sc.nextInt();
        var x=sc.nextInt();

        var a=new int[n];
        for (int i=0;i<n ;i++ )
            a[i]=sc.nextInt();


        var dp=new boolean[x+1];
        dp[0]=true;

        for (int i=0;i<n ;i++ )
        {
            for(int j=x;j>=a[i];j--)
            {
                if(dp[j-a[i]])
                    dp[j]=true;

            }

        }

        System.out.println(dp[x]?"yes":"no");
    }
}

/*
for i = 0 to x
    dp[i] <- false

dp[0] <- true   // おもりを選ばなければ、重さの和を0とすることができる

for i = 1 to n  // おもり i までのおもりを使って
    for j = x down to a_i    // 重さの和を j とすることができるか？
        if dp[j-a_i] is true then
            dp[j] <- true   

if dp[x] is true then
    print "yes"
else
    print "no"
*/
//```