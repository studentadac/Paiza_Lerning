//言語：Java
//問題URL：https://paiza.jp/works/mondai/query_primer/query_primer__interval_sum
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
        var a=new int[n];
        var s=new int[n+1];

        for (int i=0;i<n ;i++ )
        {
            a[i]=sc.nextInt();
            s[i+1]=s[i]+a[i];
        }
        
        for (int i=0;i<k ;i++ )
        {
            int l=sc.nextInt(),r=sc.nextInt();
            System.out.println(s[r]-s[l-1]);
        }
    }
}

//```