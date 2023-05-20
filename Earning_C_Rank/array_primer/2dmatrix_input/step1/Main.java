//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__2dmatrix_input_step1
//コメント：
//コード：
//```java


import java.util.*;
public class Main {
    public static void main(String[] args) {
        String S ="1 3 5 7";
        String S2="8 1 3 8";

        String ans[][] = {S.split(" ")   , S2.split(" ") };//スペースを区切り文字にして配列を作成
        for(String[] x :ans){
            System.out.println(String.join(" ",x)  );//配列の要素を空白で区切った文字列を作成

        }

    }
}


//```