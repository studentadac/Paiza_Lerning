//言語：Java
//問題URL：https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__accompanied_by_stdin_3
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
       /*変数 N を 0 で初期化する
N に A を足した値を N へ代入する
N に B をかけた値を N へ代入する
N を C で割ったあまりを N へ代入する
N を出力する*/
        Scanner sc = new Scanner(System.in);
        var a=sc.nextInt();
        var b=sc.nextInt();
        var c=sc.nextInt();
        int n=a;
        n*=b;
        n%=c;
        System.out.println(n);
    }
}
//```