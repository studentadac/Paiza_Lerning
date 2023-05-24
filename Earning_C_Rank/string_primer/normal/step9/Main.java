//言語：java
//問題URL：https://paiza.jp/works/mondai/string_primer/normal_step9
//コード：参考 https://maku77.github.io/java/numstr/is-lower-case.html
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        if(S.indexOf(T)>=0)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}
//```