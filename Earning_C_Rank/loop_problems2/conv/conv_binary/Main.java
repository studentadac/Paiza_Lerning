//言語：java
//問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__conv_binary
//コメント：参考 https://java-reference.com/java_number_hexa.html
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        sc.close();

        System.out.println(Integer.toBinaryString(n));
    }
}
//```