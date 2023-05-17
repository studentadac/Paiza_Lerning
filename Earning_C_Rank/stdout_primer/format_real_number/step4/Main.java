//言語：java
//問題URL：https://paiza.jp/works/mondai/stdout_primer__format_real_number_step4
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        int m=sc.nextInt();
        sc.close();
        String format = "%." + m + "f\n";
        System.out.printf(format, d);
    }
}
//```