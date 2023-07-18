//言語：Java
//問題URL：https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__lucky_number
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        var a=new int[n][5];
        
        for (int i=0;i<n ;i++ )
        {
            String s=sc.next();
            int x=Integer.parseInt(s);
            a[i][0]=x;
            a[i][1]=x+1;
            a[i][2]=x-1;
            a[i][3]=Integer.parseInt(s+"1");
            a[i][4]=Integer.parseInt("1"+s);
        }
        int ans=1000000;
        for (int i=0;i<n ;i++ )
        {
            for (int j=i+1;j<n ;j++ )
            {
                for (int k=0;k<5 ;k++ )
                    for (int L=0;L<5 ;L++ )
                        ans=Math.min(ans,Math.abs( a[i][k] -a[j][L]               )      );
            }
        }
        System.out.println(ans);
    }
}
//```