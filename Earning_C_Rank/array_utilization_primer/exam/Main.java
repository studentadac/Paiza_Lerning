//言語：Java
//問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__exam
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] m=new int[5];
        for (int i=0;i<5 ;i++ )
        {
            m[i]=sc.nextInt();;
        }
        int[] a=new int[n];//javaの配列は宣言したらゼロ埋めされる

        int ans=0;
        for (int j=0;j<n ;j++ )
        {
            for (int i=0;i<5 ;i++ )
            {
                a[j]+=sc.nextInt()*m[i];
            }
            ans = ans > a[j] ? ans : a[j];
        }
        sc.close();
        System.out.println(ans);
    }
}
//```