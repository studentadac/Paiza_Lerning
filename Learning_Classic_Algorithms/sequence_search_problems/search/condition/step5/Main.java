//言語：Java
//問題URL：https://paiza.jp/works/mondai/sequence_search_problems/sequence_search_problems_search_condition_step5
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
        int[] x =new int[n];
        int[] y =new int[n];
        
        for (int i=0;i<n ;i++ )
        {
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();

        }
        
        
      int x_s=sc.nextInt(), x_t=sc.nextInt(),
y_s=sc.nextInt(), y_t=sc.nextInt();
        
        int ans=0;
           for (int i=0;i<n ;i++ )
        {
           if(   (x_s<=x[i]&&x[i]<=x_t)&& (y_s<=y[i]&&y[i]<=y_t) )
           ans++;

        }
      
     System.out.println(ans);
    }

}
//```