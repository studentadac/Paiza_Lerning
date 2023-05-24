//言語：java
//問題URL：https://paiza.jp/works/mondai/string_primer/normal_step3
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        String S=sc.next();
        sb.append(S);
        int n=sc.nextInt();
        String T=sc.next();
        sb.replace(n-1,n , T);

        System.out.println(sb);
    }
}
//```