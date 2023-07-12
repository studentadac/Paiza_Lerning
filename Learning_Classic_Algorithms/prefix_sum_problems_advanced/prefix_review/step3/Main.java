//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems_advanced/prefix_sum_problems_advanced__prefix_review_step3
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
        int x=sc.nextInt();
        int y=sc.nextInt();
        char c=sc.next().toCharArray()[0];
        
        var ar=new int[n];
        var s=new long[n+1];
        
        var str=sc.next().toCharArray();
        for (int i=0;i<n ;i++ )
        {
            if(str[i]==c)
            ar[i]++;
        }

        for (int i=0;i<n ;i++ )
        {
            s[i+1]=s[i]+ar[i];
        }

        long ans= s[y]-s[x-1];
        System.out.println(ans);

    }
}
//```