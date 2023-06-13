//言語：Java
//問題URL：https://paiza.jp/works/mondai/sequence_search_problems_advanced/sequence_search_problems_advanced__range_step2
//コメント：  
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int k=sc.nextInt();
        
        int []a=new int[n];
        for (int i=0;i<n ;i++ )
        a[i]=sc.nextInt();
        
        int cnt=0,ans=0;
        for (int i=0;i<n ;i++ )
        {
            
            
            
            
            if(a[i]==x)
            cnt++;
            
            if(a[i]!=x ||i==n-1  )
            {
                if(cnt>=k)
                ans+=cnt-k+1;
                
                cnt=0;
            }
            
            
        }
       
                
        System.out.println(ans);        
        
        
        
    }
}
//```