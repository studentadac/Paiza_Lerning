//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems/prefix_sum_problems__1d_imos_boss
//コメント:
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt()+1;
        var a=new int[n];
        int q=sc.nextInt();
        for (int i=0;i<q ;i++ )
        {
            a[sc.nextInt()-1]++;
            a[sc.nextInt()]--;
        }
        sc.close();
        
      int[] s=new int[n+1];
      int ans=0;
      for (int i=0;i<n ;i++ )
      {
          s[i+1]=s[i]+a[i];
          
          if(s[i+1]>ans)
          ans=s[i+1];
          
      }
      System.out.println(ans);
      
      
      
      /*
      1 マス目から 3 マス目
1 マス目から 8 マス目
3 マス目から 8 マス目
3 マス目から 6 マス目
7 マス目から 9 マス目
      */
    }
}

//```