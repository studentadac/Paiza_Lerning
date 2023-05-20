//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__2dmatrix_input_step3
//コメント：
//コード：
//```java

import java.util.*;
public class Main {
    public static void main(String[] args) {

        final int high=5;
        Scanner sc = new Scanner(System.in);
        final int m=Integer.parseInt(sc.nextLine());//１行目を文字列として受け取った後に整数型に型変換

        String[][] a=new String[m][high];
        for (int i=0;i<m ;i++ )
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