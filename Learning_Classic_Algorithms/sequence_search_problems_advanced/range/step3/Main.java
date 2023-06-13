//言語：Java
//問題URL：https://paiza.jp/works/mondai/sequence_search_problems_advanced/sequence_search_problems_advanced__range_step3
//コメント：  ここらへんの模範解答、 O(n)のコードでも冗長では？
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
       
        
        int []a=new int[n];
        for (int i=0;i<n ;i++ )
        a[i]=sc.nextInt();
        
        int tmp=a[0],ans=1,cnt=1;
        for (int i=1;i<n ;i++ )
        {
            if(a[i]==tmp)
            cnt++;
            if(a[i]!=tmp ||i==n-1)
            {
                ans=Math.max(cnt,ans);
                cnt=1;
                tmp=a[i];
                
            }
            
          
            
        }
       
                
        System.out.println(ans);        
        
        
        
    }
}
//```