//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__string_i-thinput_step1
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] line = {"good","morning","paiza","813","pa13"};
        System.out.println(line[ sc.nextInt()-1]);
        sc.close();
    }
}
//```