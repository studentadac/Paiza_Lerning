//言語：java
//問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__space_oneline_boss
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        final int n=1000;
        int[] x =new int[n];
        for(int i=0;i<n;i++)
            x[i]=i+1;

        String[] strArray = Arrays.stream(x)//数字配列を文字列配列に変換
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        String ans=String.join(" ",strArray);
        System.out.println(ans);
    }
}
//```