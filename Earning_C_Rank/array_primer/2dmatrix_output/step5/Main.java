//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__2dmatrix_output_step5
//コメント：
//コード：
//```java
/*
以下の二次元配列を宣言し、この配列の各行の要素数を改行区切りで出力してください。

1
2 3
4 5 6
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        String S ="1";
        String S2="2 3";
        String S3="4 5 6";

        String ans[][] = {S.split(" ")   , S2.split(" ") ,S3.split(" ") };//スペースを区切り文字にして配列を作成
        for(String[] x :ans){//行を分解
            System.out.println(x.length  );//列の要素数を出力

        }
    }
}

//```