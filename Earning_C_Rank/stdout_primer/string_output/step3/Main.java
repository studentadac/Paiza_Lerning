//言語：java
//問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__string_output_step3
//コメント：n_line_step全て共通
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int n=2;
        for (int i=0;i<n ;i++ )
        {
            String s = sc.nextLine();
            System.out.println(s);
        }

    }
}
//```