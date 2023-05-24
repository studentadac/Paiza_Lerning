//言語：java
//問題URL：https://paiza.jp/works/mondai/string_primer/normal_step8
//コード：参考 https://maku77.github.io/java/numstr/is-lower-case.html
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        String S=sc.next();
        sc.close();
        for (int i=0;i<S.length() ;i++ )
        {
            if(Character.isLowerCase(S.charAt(i)))//小文字判定
                sb.append(Character.toUpperCase(S.charAt(i)));//小文字なら大文字変換
            else//入力はアルファベットしか与えられないので小文字でないなら大文字
                sb.append(Character.toLowerCase(S.charAt(i)));//小文字に変換
        }
        System.out.println(sb);
    }
}
//```