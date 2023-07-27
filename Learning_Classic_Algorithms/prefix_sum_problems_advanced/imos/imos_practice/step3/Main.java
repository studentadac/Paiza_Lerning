//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems_advanced/prefix_sum_problems_advanced__imos_practice_step3
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);

        var n=sc.nextInt();
        
        final int t=1000;
        var a=new int[t+1];

        for (var i=0;i<n ;i++ )
        {
            var l=sc.nextInt()-1;
            var r=sc.nextInt();
            var p=sc.nextInt();
            //      System.out.println(l+" "+r);
            a[l]+=p;
            a[r]-=p;
        }
        
        
        var s=new int[t+2];
        var max=0;

        for (int i=0;i<t+1 ;i++ ) 
        {
        s[i+1]=s[i]+a[i];
        max=Math.max(max,s[i+1]);
        }

        for (int i=0;i<t+1 ;i++ ) 
        {
            if(s[i+1]==max)
            System.out.println(i+1);
            
        }
        
        
 
    }
}
//```