//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems/prefix_sum_problems__2d_imos_boss
//コメント：
//コード：
//```Java

import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt()+1;
        int m=sc.nextInt()+1;
        
        int x=sc.nextInt();
      
        var a=new int[n][m];
        var b=new int[x][4];
        for (int i=0;i<x ;i++ )
            for (int j=0;j<4 ;j++ )
                b[i][j]=sc.nextInt();

        for (int i=0;i<x ;i++ )
        {
            a[b[i][1]-1][b[i][0]-1]++;
            a[b[i][3]][b[i][2]]++;
        }

        for (int i=0;i<x ;i++ )
        {
            a[b[i][3]][b[i][0]-1]--;
            a[b[i][1]-1][b[i][2]]--;
        }

        int ans=0;

        for (int i=0;i<n ;i++ )
        {
            for (int j=1;j<m ;j++ )
            {
                a[i][j]+=a[i][j-1];
            }
        }
        for (int i=1;i<n ;i++ )
        {
            for (int j=0;j<m ;j++ )
            {
                a[i][j]+=a[i-1][j];
            }

        }

        for (int i=0;i<n ;i++ )
        {
            for (int j=0;j<m ;j++ )
            {
                ans=Math.max(ans,a[i][j]);
            }
        }

        System.out.println(ans);
    }
}

//```