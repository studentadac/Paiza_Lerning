//言語：Java
//問題URL：https://paiza.jp/works/mondai/sort_advanced/sort_advanced__problems_speedup_step3
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum=0;
        int n=sc.nextInt();
        long x=sc.nextLong();
        var a=new long[n];
        for (int i=0;i<n ;i++ )
        {
            a[i]=sc.nextLong();
            sum+=a[i];
        }
        if(sum<x)//これに該当しない場合数列の総和はx以上である
        {
            System.out.println(-1);
            return;
        }
        Arrays.sort(a);
        int ans=0;
        do
        {
            x-=a[n-++ans];
        }while(x>0);//x==0でも止まる
        System.out.println(ans);
    }
}
//```