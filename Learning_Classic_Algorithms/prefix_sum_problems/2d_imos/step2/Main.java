//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems/prefix_sum_problems__2d_imos_step2
//コメント:
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
     
        int n=6;
        var a=new int[n][n];
        Scanner sc = new Scanner(System.in);
         for (int i=0;i<5 ;i++ )
         {
             int A=sc.nextInt();
             int B=sc.nextInt();
             
             a[2][A-1]++;
             a[2][B]--;
             a[3][A-1]--;
             a[3][B]++;
             
             
             
         }
         
            for (int i=0;i<n ;i++ )
        {
            for (int j=0;j<n ;j++ )
            {
         //       System.out.print(a[i][j]+"\t");
            }
      //      System.out.println();
            
        }
     
      int[][] s=new int[n+1][n+1];
      int ans=0;

          for (int i=0;i<n ;i++ )
        {
            for (int j=1;j<n ;j++ )
            {
                a[i][j]+=a[i][j-1];
            
            }
      //      System.out.println();
            // System.out.println();
        }
         for (int i=1;i<n ;i++ )
        {
            for (int j=0;j<n ;j++ )
            {
                a[i][j]+=a[i-1][j];
            
            }
         //   System.out.println();
            // System.out.println();
        }
        
          for (int i=0;i<n ;i++ )
        {
            for (int j=0;j<n ;j++ )
            {
                ans=Math.max(ans,a[i][j]);
            
            }
         //   System.out.println();
            // System.out.println();
        }
        
        
      
      System.out.println(ans);
      
      
      

    }
}

//```