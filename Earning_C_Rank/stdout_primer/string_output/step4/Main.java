//言語：java
//問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__string_output_step4
//コメント：n_line_step全て共通
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
    //    String line = sc.nextLine();
        final int n=10;
        String[] s=new String[10];
        
        for (int i=0;i<n ;i++ ) 
        {
              s[i] = sc.nextLine();
         //    System.out.println(s);
        }
        String ans=String.join(" ",s);
        System.out.println(ans);

    }
}
//```