//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__2dmatrix_output_step6
//コメント：
//コード：
//```java
/*
以下の二次元配列を宣言し、この配列の 2 行目 3 列目の要素を出力してください。

1 2 3
8 1 3
10 100 1
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        String S ="1 2 2";
        String S2="8 1 3";
        String S3="10 100 1";

        String ans[][] = {S.split(" ")   , S2.split(" ") ,S3.split(" ") };//スペースを区切り文字にして配列を作成
        System.out.println(ans[2-1][3-1]);

    }
}
//```