//言語：java
//問題URL：https://paiza.jp/works/mondai/string_primer/advance_step3
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        line =     line.replace(" ","/");
        line =     line.replace(":","/");
        line = line.replace("/","\n");

        System.out.print(line);
    }
}
//```