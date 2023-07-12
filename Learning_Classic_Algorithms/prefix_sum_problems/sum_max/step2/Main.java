//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems/prefix_sum_problems__sum_max_step2
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        final int n=10;
        var a=new int[n];
        var s=new int[n+1];
        for (int i=0;i<n ;i++ )
        {
            a[i]=sc.nextInt();
            s[i+1]=s[i]+a[i];
            
            
        }
        int ans=0;
                for (int i=3;i<n+1 ;i++ )
        {
            
            
              if(s[i]-s[i-3]>ans)
              ans=s[i]-s[i-3];
            
            
        }
        
        System.out.println(ans);
        
        
        
     
    }
}
//```