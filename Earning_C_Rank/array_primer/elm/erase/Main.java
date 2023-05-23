//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__elm_erase
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt()-1;

        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        sc.close();
        a.remove(m);


        for(var num:a)
            System.out.println(num);

    }
}
//```