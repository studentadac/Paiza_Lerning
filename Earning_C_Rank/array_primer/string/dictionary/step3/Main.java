//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__string_dictionary_step3
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String[] line = sc.nextLine().split(" ");
        sc.close();

        Arrays.sort(line);
        for(var s:line)
            System.out.println(s);

    }
}
//```