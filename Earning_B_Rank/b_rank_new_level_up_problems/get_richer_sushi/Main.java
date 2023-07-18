//言語：Java
//問題URL：https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__get_richer_sushi
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
        int k=sc.nextInt();
        var p=new long[n+k];
        for (int i=0;i<n ;i++ )
            p[i]=sc.nextInt();

        for (int i=0;i<k ;i++ )
            p[n+i]=p[i];

        var s=new long [n+k+1];
        for (int i=0;i<n+k ;i++ )
            s[i+1]=s[i]+p[i];

        long ans=0;
        for (int i=k;i<n+k+1 ;i++ )
            ans=Math.max(ans,s[i]-s[i-k]);
        System.out.println(ans);
    }
}
//```