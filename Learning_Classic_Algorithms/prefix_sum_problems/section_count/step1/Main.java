//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems/prefix_sum_problems__section_count_step1
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        final int n=10;
        final int x =2;
        final int y =7;
        int[] a= {1 ,5 ,9, 7, 5 ,3, 2, 5, 8, 4};
        var b=new int[n];
        var s=new int[n+1];
        for (int i=0;i<n ;i++ )
        {
         //   a[i]=sc.nextInt();
            b[i]=Math.abs(a[i]%2-1);
            s[i+1]=s[i]+b[i];
            
            
        }
        int ans=s[y+1]-s[x];
        
       
        System.out.println(ans);
        
        
     
    }
}
//```