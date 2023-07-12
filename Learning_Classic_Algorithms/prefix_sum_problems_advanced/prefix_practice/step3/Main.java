//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems_advanced/prefix_sum_problems_advanced__prefix_practice_step3
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
       
        var ar=new int[n];
        var s=new long[n+1];
        
        
        for (int i=0;i<n ;i++ )
        {
            ar[i]=sc.nextInt();
            s[i+1]=s[i]+ar[i];
        }
        long ans=10000;
        for (int i=0;i<n+1 ;i++ )
        {
            long sum1=s[i];
            long sum2=s[n]- sum1;
            
            ans=Math.min( ans  ,Math.abs( sum2 - sum1      ));
        }
        System.out.println(ans);
        
        
    }
}
//```