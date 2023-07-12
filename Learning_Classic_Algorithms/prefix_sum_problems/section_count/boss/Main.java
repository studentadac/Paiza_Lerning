//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems/prefix_sum_problems__section_count_boss
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
        final int x =sc.nextInt();
        final int y =sc.nextInt();
        var a=new int[n];
        var b=new int[n];
        var s=new int[n+1];
        for (int i=0;i<n ;i++ )
        {
            a[i]=sc.nextInt();
            b[i]=Math.abs(a[i]%2-1);
            s[i+1]=s[i]+b[i];
            
            
        }
        int ans=s[y+1]-s[x];
        
       
        System.out.println(ans);
        
        
     
    }
}
//```