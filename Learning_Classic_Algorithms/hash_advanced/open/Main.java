//言語：Java
//問題URL：  https://paiza.jp/works/mondai/hash_advanced/hash_advanced__open
//コメント：25点のコードをChatGPTに入力して通ったもの
//コード：
//```Java
import java.util.*;

public class Main {
    static final int mod = 1000;
    static int makeHash(String s, int i) {
        var S = s.toCharArray();
        int sum = 0;
        final int B = 997;
        int b = B;
        for (char num : S) {
            sum += num * b;
            b *= B;
            sum %= mod;
            b %= mod;
        }

        return (sum + i) % mod;
    }

    public static void main(String[] args) {
        var a = new ArrayList<String>(mod);
        for (int i = 0; i < mod; i++) {
            a.add(null);
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        var map = new HashMap<String, Integer>(mod);

        for (int i = 0; i < n; i++) {
            String[] query = sc.nextLine().split(" ");
            int q = Integer.parseInt(query[0]);

            String s = query[1];
            switch (q) {
                case 1 -> {
                    int j = 0;
                    for (; a.get(makeHash(s, j)) != null; j++) {}

                    int Hashlocale = makeHash(s, j);
                    a.set(Hashlocale, s);
                    map.put(s, Hashlocale);
                }
                case 2 -> {
                    if (map.containsKey(s)) {
                        System.out.println(map.get(s) + 1);
                    } else {
                        System.out.println(-1);
                    }
                }
            }
        }
    }
}


//```