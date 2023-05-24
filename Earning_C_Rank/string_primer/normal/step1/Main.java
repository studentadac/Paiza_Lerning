//言語：java
//問題URL：https://paiza.jp/works/mondai/string_primer/normal_step1
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        var s=(sc.next());
        int a = sc.nextInt()-1;
        int b = sc.nextInt();
        sc.close();

        System.out.println(s.substring(a,b));
    }
}
//```