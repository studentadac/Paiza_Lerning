//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__elm_insert
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt()-1;
        int k = sc.nextInt();

        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        sc.close();
        a.add(m,k);


        for(var num:a)
            System.out.println(num);

    }
}
//```