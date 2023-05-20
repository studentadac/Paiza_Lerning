//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__2dmatrix_output_step2
//コメント：
//コード：２度手間
//```java
import java.util.*;


public class Main {
    public static void main(String[] args) {
        String S ="6 5 4 3 2 1";
        String S2="3 1 8 8 1 3";

        String ans[][] = {S.split(" ")   , S2.split(" ") };//スペースを区切り文字にして配列を作成
        for(String[] x :ans){
            System.out.println(String.join(" ",x)  );//配列の要素を空白で区切った文字列を作成

        }

    }
}
//```