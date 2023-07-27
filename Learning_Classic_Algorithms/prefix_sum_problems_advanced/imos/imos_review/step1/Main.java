//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems_advanced/prefix_sum_problems_advanced__imos_review_step1
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
        var q=sc.nextInt();
        var a=new int[n+1];
        
        for (var i=0;i<q ;i++ )
        {
        var l=sc.nextInt()-1;
        var r=sc.nextInt();
  //      System.out.println(l+" "+r);
        a[l]++;
        a[r]--;
        
            
        }
        var ans=0;
        
        var s=new int[n+2];
        for (var i=0;i<n+1 ;i++ )
        ans=Math.max(ans,(s[i+1]=(a[i]+s[i])));
        
        
       
        
        System.out.println(ans);
        
        
    }
}
//```