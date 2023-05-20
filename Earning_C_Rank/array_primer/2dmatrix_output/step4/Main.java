//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__2dmatrix_output_step4
//コメント：
//コード：
//```java
/*
以下の二次元配列を宣言し、この配列の列数を出力してください。

1 2 3 4
6 5 4 3
3 1 8 1
*/


public class Main {
    public static void main(String[] args) {
        String S ="1 2 3 4";
        String S2="6 5 4 3";
        String S3="3 1 8 1";

        String ans[][] = {S.split(" ")   , S2.split(" ") ,S3.split(" ") };//スペースを区切り文字にして配列を作成
        System.out.println(ans[0].length);

    }

}

//```