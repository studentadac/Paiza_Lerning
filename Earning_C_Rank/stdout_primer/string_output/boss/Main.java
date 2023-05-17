//言語：java
//問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__string_output_boss
//コメント：n_line_step全て共通
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        //    String line = sc.nextLine();
        final int n=10;
        String[] s=new String[10];

        for (int i=0;i<n ;i++ )
        {
            s[i] = sc.next();
            //    System.out.println(s);
        }
        sc.close();
        for(var word:s)
        {
            System.out.println(word);
        }
    }
}
//```