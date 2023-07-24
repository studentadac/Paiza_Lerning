//言語：Java
//問題URL：https://paiza.jp/works/mondai/sort_advanced/sort_advanced__problems_speedup_step4
//コメント：これ系は苦手
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<int[]> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();

            a.add(new int[]{a1, a2});

        }
        a.sort(Comparator.comparingInt((int[] arr) -> arr[0]).thenComparingInt(arr -> arr[1]));

        for (int i = 0; i < n; i++) {
            System.out.println(a.get(i)[0]+" "+ a.get(i)[1]);
        }

    }
}
//```