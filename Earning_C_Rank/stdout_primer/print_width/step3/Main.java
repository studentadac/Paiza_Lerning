//言語：java
//問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__print_width_step3
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 自然数 N の入力
        final int n = scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            final int m = scanner.nextInt();
            System.out.printf("%3d\n",m);
        }
    }
}
//```