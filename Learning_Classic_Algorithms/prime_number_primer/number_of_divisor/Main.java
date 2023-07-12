//言語：Java
//問題URL：https://paiza.jp/works/mondai/prime_number_primer/prime_number_primer__number_of_divisor
//コメント：
//コード：
//```Java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                if (map.containsKey(i)) {
                    map.put(i, map.get(i) + 1);
                } else {
                    map.put(i, 1);
                }
                N /= i;
            }
        }
        
        if (N != 1) {
            if (map.containsKey(N)) {
                map.put(N, map.get(N) + 1);
            } else {
                map.put(N, 1);
            }
        }
        
        long ans = 1;
        for (int num : map.values()) {
            ans *= (num + 1);
        }
        
        System.out.println(ans);
    }
}
//```