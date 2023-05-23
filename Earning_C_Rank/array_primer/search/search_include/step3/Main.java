//言語：Java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__search_include_step3
//コメント：
//コード：
//```java

/*
    1 行目に整数 N, M が与えられます。
2 行目に N 個の整数 a_1, a_2, ..., a_N が与えられます。
N 個の整数の中に、整数 M が含まれているなら Yes、含まれていないなら No を出力してください

*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        final int n=sc.nextInt();
        final int m=sc.nextInt();

        int[] nums=new int[n];
        for (int i=0;i<n ;i++ )
        {
            nums[i]=sc.nextInt();
        }
        sc.close();

        for(int num:nums)
        {
            if(num==m)
            {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
//```