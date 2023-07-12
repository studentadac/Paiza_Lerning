//言語：Java
//問題URL：https://paiza.jp/works/mondai/prime_number_primer/prime_number_primer__least_common_multiple
//コメント：最小公倍数を求める場合は毎回素因数分解しなければいけない、と
//コード：
//```Java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Map<Integer, Integer> primeFactors = new HashMap<>();

        int baseValue = sc.nextInt();
        calculatePrimeFactors(baseValue, primeFactors);

        for (int i = 0; i < N - 1; i++) {
            int value = sc.nextInt();
            Map<Integer, Integer> factors = new HashMap<>();
            calculatePrimeFactors(value, factors);

            for (var entry : factors.entrySet()) {
                int primeFactor = entry.getKey();
                int count = entry.getValue();
                primeFactors.put(primeFactor, Math.max(count, primeFactors.getOrDefault(primeFactor, 0)));
            }
        }

        long lcm = 1;
        for (var entry : primeFactors.entrySet()) {
            int primeFactor = entry.getKey();
            int count = entry.getValue();
            lcm *= Math.pow(primeFactor, count);
        }

        System.out.println(lcm);
    }

    private static void calculatePrimeFactors(int num, Map<Integer, Integer> primeFactors) {
        for (int i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                updatePrimeFactors(i, primeFactors);
                num /= i;
            }
        }

        if (num != 1) {
            updatePrimeFactors(num, primeFactors);
        }
    }

    private static void updatePrimeFactors(int primeFactor, Map<Integer, Integer> primeFactors) {
        primeFactors.put(primeFactor, primeFactors.getOrDefault(primeFactor, 0) + 1);
    }
}
//```