//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems_advanced/prefix_sum_problems_advanced__prefix_practice_step4
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int n=1001;
       
        var ar=new int[n];
        var s=new long[n+1];
        
        for (int i=15;i<n ;i++ )
        {
           if(i%15==0) ar[i]++;
           s[i]=s[i-1]+ar[i];
        }
        
        
        Scanner sc = new Scanner(System.in);
        int q=sc.nextInt();
       
        
        for (int i=0;i<q ;i++ )
        {
            int l=sc.nextInt();
            int r=sc.nextInt();
            var ans=s[r]-s[l-1];
            System.out.println(ans);
        }
       
        
    }
}
//```