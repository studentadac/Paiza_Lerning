//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_009/forest_contest_009__c_egg3
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
        var s =new int [n+1];
        for (int i=0;i<n ;i++ )
        {
            
        a[i]=sc.nextInt();
        s[i+1]=s[i]+a[i];
   //     System.out.println(s[i]);
        }
        int max=0;
        for (int i=k;i<n+1 ;i++ )
        {
            max=Math.max((s[i]-s[i-k]),max);
          //  System.out.println(s[i]-s[i-k]);
            
        }
        System.out.println(max);
        
        
    }
}
//```