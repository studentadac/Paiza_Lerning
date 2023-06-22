//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems/prefix_sum_problems__section_sum_boss
//コメント： 
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
        final int n=sc.nextInt();
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        int a[]=new int [n];
        int s[]=new int[n+1];
        int sum=0;
        for (int i=0;i<n ;i++ )
        
        {
            a[i]=sc.nextInt();
          s[i+1]=s[i]+a[i];
            
        }
        
        System.out.println(s[y+1]-s[x]);
        
    }
}
//```