//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__1dmatrix_i-thoutput_step1
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        
        String S="1 3 5 4 6 2 1 7 1 5";
        String ans[] = S.split(" ");//スペースを区切り文字にして配列を作成
        
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt()-1;//練習問題で定義された配列では１から数えるがjavaの配列は０から数えるので1を引く
        sc.close();
        
        System.out.println(ans[k]);
    
    }
}
//```