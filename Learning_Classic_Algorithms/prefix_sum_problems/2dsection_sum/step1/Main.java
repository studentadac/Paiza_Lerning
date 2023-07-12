//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems/prefix_sum_problems__2dsection_sum_step1
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        int[][] a={
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7},
                {4, 5, 6, 7, 8},
                {5, 6, 7, 8, 9}

        };

        var aYl=a.length;
        var aXl=a[0].length;

        var s= new int[aYl+1][aXl+1];
        for (int i=0;i<aYl ;i++ )
        {
            for (int j=0;j<aXl ;j++ )
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