//言語：java
//問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__specific_split_step5
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = 10;
        String s[]=new String[n];
        for (int i=0;i<n ;i++ )
        {
            s[i]=sc.next();
        }

        String ans=String.join(" | ",s);// | で結合
        System.out.println(ans);
    }
}
//```