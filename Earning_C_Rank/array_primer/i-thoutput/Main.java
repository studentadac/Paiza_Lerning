//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__1dmatrix_i-thoutput_step2
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int k=sc.nextInt()-1;
        sc.nextLine();//nextIntは改行されないので改行用
        String S=sc.nextLine();

        String ans[] = S.split(" ");//スペースを区切り文字にして配列を作成
        System.out.println(ans[k]);//配列の要素数を表示
    }
}
//```