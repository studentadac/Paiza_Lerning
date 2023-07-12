//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems/prefix_sum_problems__2d_imos_step1
//コメント:
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
     
        int n=6;
        var a=new int[n][n];
        a[0][0]++;
        a[1][1]++;
        a[2][2]++;
        a[0][2]++;
        a[2][0]++;
        
        a[3][3]--;
        a[4][4]--;
        a[5][5]--;
        a[3][5]--;
        a[5][3]--;
        
        
        
      
        
              /*
(1, 1) (3, 3)
(2, 2) (4, 4)
(3, 3) (5, 5)
(1, 3) (3, 5)
(3, 1) (5, 3)
      */
     
     
     
      int[][] s=new int[n+1][n+1];
      int ans=0;

          for (int i=0;i<n ;i++ )
        {
            for (int j=0;j<n ;j++ )
            {
                //s_{y + 1, x + 1} = s_{y, x + 1} + s_{y + 1, x} - s_{y, x} + A_{y, x}
                s[i+1][j+1]=s[i][j+1]+s[i+1][j]-s[i][j]+a[i][j];
                if(s[i+1][j+1]>ans)
                 ans=s[i+1][j+1];
                
                //  System.out.print(s[i+1][j+1]+" ");
            }
            // System.out.println();
        }
      
      System.out.println(ans);
      
      
      

    }
}

//```