//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__array_elm_change
//コメント：
//コード：
//```java
/*1 行目に整数 A, B, N が与えられます。
2 行目に N 個の整数 a_1, a_2, ..., a_N が与えられます。
N 個の整数の左から A 番目の数と B 番目の数の値を入れ替えて、改行区切りで出力してください。
なお、左端を 1 番目とします。*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt()-1, b= sc.nextInt()-1, n= sc.nextInt();//nは使わない
        sc.nextLine();

        String s[]=sc.nextLine().split(" ");
        sc.close();
        String tmp=s[b];
        s[b]=s[a];
        s[a]=tmp;

        for(String num:s)
            System.out.println(num);


    }
}
//```