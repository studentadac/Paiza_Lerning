//言語：Java
//問題URL：https://paiza.jp/works/mondai/prime_number_primer/prime_number_primer__paiza_conjecture
//コメント：chatgpt使用 模範解答のデータ入力後
//コード：
//```Java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Long> ans = new ArrayList<>();

        for (long i = 3; i * i <= 100000000; i += 2) {
            if (!isPrime(i * i - 2)) {
                ans.add(i * i);
            }
        }

        if (ans.isEmpty()) {
            System.out.println("paiza's conjecture is correct.");
        } else {
            for (long a : ans) {
                System.out.println(a);
            }
        }
    }

    private static boolean isPrime(long num) {
        if (num < 2) {
            return false;
        }

        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}

//```