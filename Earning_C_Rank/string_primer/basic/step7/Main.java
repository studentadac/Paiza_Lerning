//言語：java
//問題URL：https://paiza.jp/works/mondai/string_primer/basic_step7
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++)
        {
            sb.append(sc.next());
        }
        System.out.println(sb.toString());
    }
}
//```