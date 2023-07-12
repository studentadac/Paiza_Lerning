//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems/prefix_sum_problems__sum_max_step3
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        final int n=sc.nextInt();
        var a=new int[n];
        var s=new int[n+1];
        for (int i=0;i<n ;i++ )
        {
            a[i]=sc.nextInt();
            s[i+1]=s[i]+a[i];
            
            
        }
        int ans=0;
        final int section =3;
                for (int i=section;i<n+1 ;i++ )
        {
            
            int sum=s[i]-s[i- section ];
            
              if(sum>ans)
              ans=sum;
             
            
            
        }
        
        System.out.println(ans);
        
        
        
     
    }
}
//```