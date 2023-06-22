//言語：Java
//問題URL：https://paiza.jp/works/mondai/query_primer/query_primer__history
//コメント： わからなかったのでChatGPTだより
//コード：
//```Java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        Map<Integer, List<String>> historyMap = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            String member = sc.next();
        }

        for (int i = 0; i < K; i++) {
            int year = sc.nextInt();
            String member = sc.next();

            if (!historyMap.containsKey(year)) {
                historyMap.put(year, new ArrayList<>());
            }
            historyMap.get(year).add(member);
        }

        for (List<String> members : historyMap.values()) {
            Collections.sort(members);
            for (String member : members) {
                System.out.println(member);
            }
        }
    }
}
//```