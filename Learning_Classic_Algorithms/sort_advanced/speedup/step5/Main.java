//言語：Java
//問題URL：https://paiza.jp/works/mondai/sort_advanced/sort_advanced__problems_speedup_step5
//コメント：これ系は苦手 ChatGPT使用
//コード：
//```Java
import java.util.*;
import java.util.stream.Collectors;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt() - 1;
        var b = new ArrayList<LinkedList<Integer>>(n);

        for (int i = 0; i < n; i++) {
            var a = new LinkedList<Integer>();
            for (int j = 0; j < m; j++) {
                a.add(sc.nextInt());
            }
            b.add(a);
        }

        // Custom comparator to sort based on the conditions given in the problem statement
        Collections.sort(b, (list1, list2) -> {
            int cmp = list1.get(k).compareTo(list2.get(k));
            if (cmp != 0) return cmp;
            
            for (int i = 0; i < m - 1; i++) {
                if (list1.get(i).equals(list2.get(i))) continue;
                return list1.get(i).compareTo(list2.get(i));
            }
            
            return 0;
        });

        for (var a : b) {
            System.out.println(
                    a.stream()
                            .map(Object::toString)
                            .collect(Collectors.joining(" "))
            );
        }
    }
}
//```