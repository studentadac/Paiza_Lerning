//言語：Java
//問題URL：https://paiza.jp/works/mondai/prob60/sort_asc_9
//コメント：クラスの問題の模範解答を参考にしました。 変数名のつけ方が計画的ではなかった
//コード：
//```Java
import java.util.*;

class A
{
    String s;
    int  num;

}
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        A[] a=new A[n];
        for (int i = 0; i < n; i++) {
            a[i] = new A();
            a[i].s = sc.next();
            a[i].num = sc.nextInt();
        }
        sc.close();
        Arrays.sort(a, (b, c) -> b.num - c.num);

        for(var  aa: a )
            System.out.println(aa.s);
    }
}
//```