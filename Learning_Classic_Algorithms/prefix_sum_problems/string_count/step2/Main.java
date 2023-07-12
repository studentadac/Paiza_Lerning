//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems/prefix_sum_problems__string_count_step2
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var c =sc.next().toCharArray();//文字列をchar配列に変換
        final int n=c.length;//cの長さ
        var a=new int [n];//配列の初期値はゼロ埋め
        var s=new int [n+1];//総和

        for (int i=0;i<n ;i++ )
        {

            if(c[i]=='b')
                a[i]=1;//bの位置

            s[i+1]=s[i]+a[i];//s[i+1]はa[i]、までの'b'の総和

        }

        System.out.println(s[8]-s[2]);//s[8]-s[3-1]

    }
}
//```