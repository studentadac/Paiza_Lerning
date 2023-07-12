//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems/prefix_sum_problems__2dsection_sum_step4
//コメント:
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        int h=5,w=5;
        
        
        int[][] a=new int[h][w];
        Scanner sc = new Scanner(System.in);
        int A,B,C,D;
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();
        D=sc.nextInt();
        
        
        
        for (int i=0;i<h ;i++ )
        {
            for (int j=0;j<w ;j++ )
            {
                a[i][j]=sc.nextInt();
                
            }
            
        }

      

        var s= new int[h+1][w+1];
        for (int i=0;i<h ;i++ )
        {
            for (int j=0;j<w ;j++ )
            {
                //s_{y + 1, x + 1} = s_{y, x + 1} + s_{y + 1, x} - s_{y, x} + A_{y, x}
                s[i+1][j+1]=s[i][j+1]+s[i+1][j]-s[i][j]+a[i][j];
                //  System.out.print(s[i+1][j+1]+" ");
            }
            // System.out.println();
        }
        int ans=s[C+1][D+1]-s[C+1][B]-s[A][D+1]+s[A][B];
        System.out.println(ans);
    }
}
//```