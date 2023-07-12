//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems_advanced/prefix_sum_problems_advanced__prefix_practice_step5
//コメント：入力のサイズ的に累積和を使わなくてもごり押しでとけそうだからCランクなのかなと思いました。
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
       
        var ar=new int[n];
        var left=new long[n+1];
        var right=new long[n+1];
        
        for (int i=0;i<n ;i++ )
        {
            ar[i]=sc.nextInt();
           // s[i+1]=Math.max(s[i],ar[i]);
        }
        for (int i=0;i<n ;i++ )
        {
            left[i+1]=Math.max(left[i],ar[i]);
            right[i+1]=Math.max(right[i],ar[n - i - 1]);
        }
        
        
        for (int i=1;i<n-1 ;i++ )
        {
            long sum1=left[i];
            long sum2=right[n-i-1];
            
            var ans=Math.min(  sum2 , sum1      );
            System.out.println(ans);
        }
        
        
    }
}
//```