//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__1dmatrix_input_step2
//コメント：
//コード：
//```java

import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S=sc.nextLine();

        String ans[] = S.split(" ");//スペースを区切り文字にして配列を作成
        
        for (String num:ans)
        System.out.println(num);
    }
}
//```