//言語：Java
//問題URL：https://paiza.jp/works/mondai/dp_primer/dp_primer_partial_sums_boss
//コメント： 参考 https://jaigotec.com/paiza-dp_primer_partial_sums/
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
           for(int j=a[i];j<x+1;j++)
            {
                dp[j]=dp[j] | dp[j-a[i] ];
            }
        }

        System.out.println(dp[x]?"yes":"no");
    }
}

//```