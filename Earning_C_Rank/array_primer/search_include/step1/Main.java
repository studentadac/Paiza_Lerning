//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__search_include_step1
//コメント：
//コード：
//```java

/*
1 行目に整数 N, M, K, L が与えられます。
2 行目以降に N 行 M 列の二次元配列が与えられます。
配列の K 行目 L 列目の要素を出力してください。
上から i 番目、左から j 番目の整数は a_ij です。
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String line = "10 13 21 1 6 51 10 8 15 6";

        if(line.indexOf("6")!=-1)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}

//```