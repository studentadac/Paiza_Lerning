//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_008/forest_contest_008__currency_rate
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        
        var n = sc.nextInt();
        
        int [] a=new int [n];
        for (int i=0;i<n ;i++ )
        a[i]=sc.nextInt();
        
        int ans1=0,ans2=0;
        
        int max_profit=0;
        for (int i=0;i<n ;i++ )
        {
            int profit=0;
        for (int j=i+1;j<n ;j++ )
        {
            if(profit<(a[j]-a[i]) )
            
            {
            profit=(a[j]-a[i]) ;
            if(max_profit<profit)
            {
                max_profit=profit;
                ans1=i+1;
                ans2=j+1;
                
            }
            
            
            }
        
             
                
            
            
        }
        
        
        }
        if(max_profit>0)
        {
            System.out.println(ans1);
            System.out.println(ans2);
        }
        else
        System.out.println("No");
        
        
    }
}
//```