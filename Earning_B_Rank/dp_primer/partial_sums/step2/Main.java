//言語：Java
//問題URL：https://paiza.jp/works/mondai/dp_primer/dp_primer_partial_sums_step2
//コメント： 前に解いた人のコードを参考にしました
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


        var dp=new int[x+1];
        Arrays.fill(dp,n+1);
        
        dp[0]=0;
        

        for (int i=0;i<n ;i++ )
        {
            for(int j=x;j>=a[i];j--)
            {
                if(dp[j-a[i]]>=0)
                {
                    dp[j]=Math.min(dp[j],dp[j-a[i]]+1);
            
                }

            }

        }
        
    //    for (int i=0;i<x+1 ;i++ )
     //   System.out.print(dp[i]+" ");
        

        System.out.println(dp[x]==n+1?-1:dp[x]);
    }
}


//```