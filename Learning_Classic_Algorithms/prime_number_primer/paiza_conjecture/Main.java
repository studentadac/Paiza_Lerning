//言語：Java
//問題URL：https://paiza.jp/works/mondai/prime_number_primer/prime_number_primer__paiza_conjecture
//コメント：chatgpt使用
//コード：
//```Java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        final int n = 9999;
        var p = sieve(31623);
        var s = generateSquares(10000 * 10000);

        for (long sq : s) {
            boolean e = false;

            for (long pr : p) {
                if (pr > sq / 2) break;
                if (isPrime(sq - pr, p)) {
                    e = true;
                    break;
                }
            }

            if (!e) System.out.println(sq);
        }

    }

    private static long[] sieve(int n) {
        var b = new boolean[n + 1];
        Arrays.fill(b, true);
        b[0] = b[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (b[i]) {
                for (int j = i * i; j <= n; j += i) {
                    b[j] = false;
                }
            }
        }

        var p = new ArrayList<Long>();
        for (int i = 2; i <= n; i++) {
            if (b[i]) p.add((long) i);
        }

        return p.stream().mapToLong(Long::valueOf).toArray();
    }

    private static List<Long> generateSquares(int l) {
        var s = new ArrayList<Long>();
        long num = 2;
        while (num * num <= l) {
            s.add(num * num);
            num++;
        }
        return s;
    }

    private static boolean isPrime(long num, long[] p) {
        if (num < 2) return false;
        for (long prime : p) {
            if (prime * prime > num) break;
            if (num % prime == 0) return false;
        }
        return true;
    }
}


//```