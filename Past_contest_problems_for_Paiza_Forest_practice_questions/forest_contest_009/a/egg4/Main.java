//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_009/forest_contest_009__c_egg4
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
        int k=sc.nextInt();
        var a=new int [n];
       // var s =new int [n+1];
       for (int i=0;i<n ;i++ )
        {
            
        a[i]=sc.nextInt();
    //    s[i+1]=s[i]+a[i];
   //     System.out.println(s[i]);
        }
        
        int ans=0;
        
         for (int j = 0; j < 1 << n; j++)
       { int sum=0;
           for (int i=0;i<n ;i++ )
        {
         if(((j>>i)&1)==1)

                sum+=a[i];
            
        }
       // System.out.println(sum);
        if(sum==k)
        ans++;
        
       }
        
        
        System.out.println(ans);
        
        
    }
}
//```