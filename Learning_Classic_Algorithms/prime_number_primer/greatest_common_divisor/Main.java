//言語：Java
//問題URL：https://paiza.jp/works/mondai/prime_number_primer/prime_number_primer__greatest_common_divisor
//コメント：最初の入力の素因数を分解して、共通する素因数だけで求めるという骨子は自分のアイデア、こまかいところはChatGPT
//コード：
//```Java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Map<Integer, Integer> MotherMap = new HashMap<>();

        int x = sc.nextInt();
        for (int i = 2; i * i <= x; i++) {
            int count = 0;
            while (x % i == 0) {
                count++;
                x /= i;
            }
            MotherMap.put(i, count);
        }
        if (x != 1) {
            MotherMap.put(x, 1);
        }

       // List<Integer> keysToRemove = new ArrayList<>();

        for (int j = 0; j < N - 1; j++) {
            int N_value = sc.nextInt();

            Map<Integer, Integer> map = new HashMap<>();

            for (var num : MotherMap.entrySet()) {
                int i = num.getKey();
                if (N_value % i != 0) {
                 //   keysToRemove.add(i);
                    continue;
                }

                int count = 0;
                while (N_value % i == 0) {
                    N_value /= i;
                    count++;
                }
                map.put(i, count);
            }

            for (var num : map.entrySet()) {//問題の拡張for文
                map.put(num.getKey(), Math.min(num.getValue(), MotherMap.get(num.getKey())));
            }
        

        // 共通する素因数のみに更新
        MotherMap=map;
        }

        long ans = 1;
        for (var num : MotherMap.entrySet()) {
            ans *= Math.pow(num.getKey(), num.getValue());
        }

        System.out.println(ans);
    }
}
//```