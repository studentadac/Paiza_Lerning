//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__2dmatrix_i-thoutput_step2
//コメント：
//コード：
//```java

/*
1 行目に整数 K と 整数 L が与えられます。
2 行目以降に 3 行 3 列の二次元配列が与えられます。
配列の K 行目 L 列目の要素を出力してください。
上から i 番目、左から j 番目の整数は a_ij です。
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int k=sc.nextInt()-1, l=sc.nextInt()-1;
        sc.nextLine();
        
        final int w=3,h=3;
        String[]s = new String[h];
        for (int i=0;i<h ;i++ )
            s[i]= sc.nextLine();
        sc.close();
        
        String ans[][] = new String[h][w];
        for (int i=0;i<h ;i++ )
        {
            ans[i]=s[i].split(" ");
        }
        
        System.out.println(ans[k][l]);

    }
}
//```