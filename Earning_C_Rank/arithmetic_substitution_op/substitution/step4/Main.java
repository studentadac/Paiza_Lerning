//言語：java
//問題URL：https://paiza.jp/works/mondai/arithmetic_substitution_op/arithmetic_substitution_op__substitution_step4
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b  = sc.nextInt();
        int n=(10000/a)%b;
        System.out.println(n);
    }
}

/*変数 N を 10,000 で初期化する
N を A で割った商を N へ代入する
N を B で割った余りを N へ代入する
N を出力する*/
//```