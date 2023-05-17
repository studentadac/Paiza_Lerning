//言語：java
//問題URL：https://paiza.jp/works/mondai/stdout_primer__space_oneline_step4
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        final int n=10;
        int[] x =new int[10];
        for(int i=0;i<n;i++)
            x[i]=i+1;

        String[] strArray = Arrays.stream(x)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        String ans=String.join(" ",strArray);
        System.out.println(ans);
        //  System.out.println(" ");
    }
}
//```