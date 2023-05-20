//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__2dmatrix_i-thoutput_boss
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
        Scanner sc = new Scanner(System.in);
        final int n=sc.nextInt(), m=sc.nextInt(), k=sc.nextInt()-1, l=sc.nextInt()-1;
        sc.nextLine();
        
        String ans[][] = new String[n][m];
        for (int i=0;i<n ;i++ )
        {
            ans[i]= sc.nextLine().split(" ");
        }
        sc.close();
        
        System.out.println(ans[k][l]);

    }
}


//```