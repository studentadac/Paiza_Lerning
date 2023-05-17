//言語：java
//問題URL：https://paiza.jp/works/mondai/stdin_primer/stdin_primer__integer_number_boss
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();

        for(int i=0;i<n;i++) {
            long input = scanner.nextLong();
            System.out.println(input);
           // System.out.println(n);
        }

        scanner.close();
    }
}
//```