//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems_advanced/prefix_sum_problems_advanced__imos_practice_boss
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var n=sc.nextInt();
        var q=sc.nextInt();
        var m=sc.nextInt();

        var a=new int[n][n];
        for (var i=0;i<n ;i++ )
        {
            for (var j=0;j<n ;j++ )
            {
                a[i][j]=sc.nextInt();
            }
        }
        
        var s=new int[n+1][n+1];
        for (int i=0;i<q ;i++ )
        {
            int x=sc.nextInt()-1;
            int y=sc.nextInt()-1;

            s[y][x]++;
            s[y+m][x+m]++;
            s[y][x+m]--;
            s[y+m][x]--;
        }
        
        var dmg=new int[n+2][n+2];
        for (var i=0;i<n+1 ;i++ )
        {
            for (var j=0;j<n+1 ;j++ )
            {
                dmg[i+1][j+1]=dmg[i+1][j]+dmg[i][j+1]+s[i][j]-dmg[i][j];
                //      System.out.print(dmg[i+1][j+1]+" ");
            }
            //  System.out.println();
        }



        int ans=0;
        for (var i=0;i<n ;i++ )
        {
            for (var j=0;j<n ;j++ )
            {
                if(a[i][j]<=dmg[i+1][j+1])
                    ans++;
            }
        }
        System.out.println(ans);
    }
}
//```