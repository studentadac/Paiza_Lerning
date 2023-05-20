//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__2dmatrix_output_step3
//コメント：
//コード：
//```java
import java.util.*;


public class Main {
    public static void main(String[] args) {
        String S ="1 2 3";
        String S2="4 5 6";
        String S3="8 1 3";

        String ans[][] = {S.split(" ")   , S2.split(" ") ,S3.split(" ") };//スペースを区切り文字にして配列を作成
        System.out.println(ans.length);

    }
}
}
//```