//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__1dmatrix_i-thoutput_boss
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(),k = sc.nextInt()-1;    //練習問題で定義された配列では１から数えるがjavaの配列は０から数えるので1を引く、
//nは１行をそのまま配列に変換するので使わない
        sc.nextLine();//改行

        String S=  sc.nextLine();
        sc.close();
        String ans[] = S.split(" ");//スペースを区切り文字にして配列を作成

        System.out.println(ans[k]);

    }
}
//```