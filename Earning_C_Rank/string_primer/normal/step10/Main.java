//言語：java
//問題URL：https://paiza.jp/works/mondai/string_primer/normal_step10
//コード：参考 https://maku77.github.io/java/numstr/is-lower-case.html
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        sb.reverse();
        System.out.println(sb);


    }
}
//```