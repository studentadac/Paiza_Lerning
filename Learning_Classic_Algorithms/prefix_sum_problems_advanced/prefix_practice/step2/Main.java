//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems_advanced/prefix_sum_problems_advanced__prefix_practice_step2
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
        String key="piz";

        var ar=new int[n];
        var s=new long[n+1];
        
        var str=sc.next();
        for (int i=0;i<n-3 ;i++ )
        {
            
       //     System.out.println(str.substring(i,i+3));
            if(key.equals(str.substring(i,i+3)))
            ar[i]++;
        }

        for (int i=0;i<n ;i++ )
        {
            s[i+1]=s[i]+ar[i];
        }

        long ans= s[b-2]-s[a-1];
        System.out.println(ans);

    }
}
//```