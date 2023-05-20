//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__2dmatrix_input_step4
//コメント：
//コード：
//```java

import java.util.*;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        final int n=sc.nextInt(),m=sc.nextInt();
        sc.nextLine();//1行目の入力を受け取る

        String[][] a=new String[n][m];
        for (int i=0;i<n ;i++ )//javaの拡張for文は値渡しなので従来のfor文を使う
        {
            a[i]=sc.nextLine().split(" ") ;//文字列をスペースで区切り文字列配列に変換
        }
        sc.close();

        for(String[] x :a){
            System.out.println(String.join(" ",x)  );//配列の要素を空白で区切った文字列を作成

        }
    }
}
//```