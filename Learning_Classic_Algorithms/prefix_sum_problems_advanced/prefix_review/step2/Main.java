//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems_advanced/prefix_sum_problems_advanced__prefix_review_step2
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
        int a=sc.nextInt();
        int b=sc.nextInt();
        var ar=new int[n];
        var s=new long[n+1];
        for (int i=0;i<n ;i++ )
        {
            ar[i]=sc.nextInt();
        }

        for (int i=0;i<n ;i++ )
        {
            s[i+1]=s[i]+ar[i];
        }

        long ans= s[b+1]-s[a];
        System.out.println(ans);

    }
}
//```