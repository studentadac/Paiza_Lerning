//言語：java
//問題URL：https://paiza.jp/works/mondai/arithmetic_substitution_op/arithmetic_substitution_op__substitution_step2
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
     
        int a = sc.nextInt(), b  = sc.nextInt(), c =  sc.nextInt();
        int n=a;
        n*=b;
        n%=c;
        System.out.println(n);

    }
}
/*変数 N を 0 で初期化する
N に A を足した値を N へ代入する
N に B をかけた値を N へ代入する
N を C で割ったあまりを N へ代入する
N を出力する*/
//```