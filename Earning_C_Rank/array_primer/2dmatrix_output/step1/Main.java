//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__2dmatrix_output_step1
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
     String S ="1 2 3 4 5 6";
     String S2="8 1 3 3 1 8";

     String ans[][] = {S.split(" ")   , S2.split(" ") };//スペースを区切り文字にして配列を作成
     System.out.println(ans[0].length+ans[1].length);
        
    }
}
//```