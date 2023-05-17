//言語：java
//問題URL：https://paiza.jp/works/mondai/stdin_primer/stdin_primer__string_number_step1
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       String dummy=scanner.nextLine();//nの行の入力を改行

        for(int i=0;i<n;i++) {
            String input = scanner.nextLine();
            System.out.println(input);
           // System.out.println(n);
        }

        scanner.close();
    }
}
//```