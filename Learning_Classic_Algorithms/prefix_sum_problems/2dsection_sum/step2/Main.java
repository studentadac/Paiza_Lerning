//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems/prefix_sum_problems__2dsection_sum_step2
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        int h=5,w=5;
        int[][] a=new int[h][w];
        Scanner sc = new Scanner(System.in);
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
        int ans=s[4][4]-s[4][1]-s[1][4]+s[1][1];
        System.out.println(ans);
    }
}
//```