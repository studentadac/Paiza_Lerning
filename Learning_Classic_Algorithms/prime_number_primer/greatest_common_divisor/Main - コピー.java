//言語：Java
//問題URL：https://paiza.jp/works/mondai/prime_number_primer/prime_number_primer__greatest_common_divisor
//コメント：なんか凝ってしまいました
//コード：
//```Java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Set<Integer> setA = new HashSet<>(N);
        for (int i = 0; i < N; i++) {
            setA.add(sc.nextInt());
        }

        Map<Integer, Integer> MotherMap = primeFactorization(setA.iterator().next());

        for (int num : setA) {
            MotherMap = updateFactorMap(MotherMap, num);
        }

        long ans = calculateLCM(MotherMap);

        System.out.println(ans);
    }

    private static Map<Integer, Integer> primeFactorization(int num) {
        Map<Integer, Integer> primeFactors = new HashMap<>();
        for (int i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                primeFactors.put(i, primeFactors.getOrDefault(i, 0) + 1);
                num /= i;
            }
        }
        if (num > 1) {
            primeFactors.put(num, 1);
        }
        return primeFactors;
    }

    private static Map<Integer, Integer> updateFactorMap(Map<Integer, Integer> factorMap, int num) {
        Map<Integer, Integer> updatedMap = new HashMap<>(factorMap);
        for (var numEntry : factorMap.entrySet()) {
            int prime = numEntry.getKey();
            int count = numEntry.getValue();
            int factorCount = 0;
            while (num % prime == 0) {
                num /= prime;
                factorCount++;
            }
            updatedMap.put(prime, count < factorCount ? count : factorCount);
        }
        return updatedMap;
    }

    private static long calculateLCM(Map<Integer, Integer> factorMap) {
        long lcm = 1;
        for (var num : factorMap.entrySet()) {
            int prime = num.getKey();
            int count = num.getValue();
            lcm *= Math.pow(prime, count);
        }
        return lcm;
    }
}
//```