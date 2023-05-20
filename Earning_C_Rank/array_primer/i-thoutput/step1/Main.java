//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__2dmatrix_i-thoutput_step1
//コメント：
//コード：
//```java

/*
整数 K と 整数 L が与えられます。
以下の二次元配列 a を宣言し、この配列の K 行目 L 列目の要素を出力してください。
上から i 番目、左から j 番目の整数は a_ij です。

1 2 3 4
10 100 0 5
8 1 3 8
15 34 94 25
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        final int w=4,h=4;
        String[]s = new String[h];
        s[0]="1 2 3 4";
        s[1]="10 100 0 5";
        s[2]="8 1 3 8";
        s[3]="15 34 94 25";
        String ans[][] = new String[h][w];

        for (int i=0;i<h ;i++ )
        {
            ans[i]=s[i].split(" ");
        }
        
        Scanner sc = new Scanner(System.in);
        final int k=sc.nextInt()-1, l=sc.nextInt()-1;
        sc.close();

        System.out.println(ans[k][l]);
        
    }
}




//```