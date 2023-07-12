//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems/prefix_sum_problems__sum_max_step1
//コメント： 
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
        final int n=10;
        int b=3;//ブランク
        int x,y;
    //    x=sc.nextInt();
//=sc.nextInt();
        int a[]={1, 5, 9, 7 ,5, 3 ,2 ,5, 8 ,4};
        int s[]=new int[n+1];
        for (int i=0;i<n ;i++ )
        
        {
           // a[i]=sc.nextInt();
          s[i+1]=s[i]+a[i];
            
        }
        
        int ans=0;
         for (int i=0;i<n-7 ;i++ )
        
        {
          
         ans=Math.max(ans,s[i+3]-s[i] );
            
        }
        
        
        System.out.println(ans);
        
    }
}
//```