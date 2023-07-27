//言語：Java
//問題URL：https://paiza.jp/works/mondai/query_primer/query_primer__two_dimensions_interval_sum
//コメント：
//コード：
//```Java

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        int n=sc.nextInt();
        var a=new int[h][w];
        
        for (int i=0;i<h ;i++ )
        for(int j=0;j<w;j++)
        a[i][j]=sc.nextInt();
        
        var s=new int[h+1][w+1];
        for (int i=0;i<h ;i++ )
        for(int j=0;j<w;j++)
        s[i+1][j+1]=s[i][j+1]+s[i+1][j]-s[i][j]+a[i][j];
        
        for (int i=0;i<n ;i++ )
        {
            int y=sc.nextInt();
            int x=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            System.out.println(s[c][d]+s[y-1][x-1]-s[y-1][d]-s[c][x-1]         );
            
        }
        
        
        
    }
}



//```