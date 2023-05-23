//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__push_back
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        a.add(m);
        sc.close();

        for(var num:a)
            System.out.println(num);

    }
}
//```