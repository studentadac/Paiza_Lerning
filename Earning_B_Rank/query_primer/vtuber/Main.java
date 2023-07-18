//言語：Java
//問題URL：https://paiza.jp/works/mondai/query_primer/query_primer__vtuber
//コメント：chatgpt使用 模範解答のデータ入力後
//コード：
//```Java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        
        // スーパーチャットの総額を管理するMap
        Map<String, Long> superchatMap = new HashMap<>();
        // メンバーシップ加入者を管理するSet
        Set<String> membershipSet = new TreeSet<>();
        
        for (int i = 0; i < N; i++) {
            String[] event = sc.nextLine().split(" ");
            String name = event[0];
            
            if (event[1].equals("give")) {
                long money = Long.parseLong(event[2]);
                if (superchatMap.containsKey(name)) {
                    superchatMap.put(name, superchatMap.get(name) + money);
                } else {
                    superchatMap.put(name, money);
                }
            } else if (event[1].equals("join") && event[2].equals("membership!")) {
                membershipSet.add(name);
            }
        }
        
        // スーパーチャットの総額が高い順にソート
        List<Map.Entry<String, Long>> superchatList = new ArrayList<>(superchatMap.entrySet());
        Collections.sort(superchatList, (a, b) -> {
            if (a.getValue().equals(b.getValue())) {
                return b.getKey().compareTo(a.getKey());
            }
            return b.getValue().compareTo(a.getValue());
        });
        
        // スーパーチャットのアカウント名を出力
        for (Map.Entry<String, Long> entry : superchatList) {
            System.out.println(entry.getKey());
        }
        
        // メンバーシップ加入者を辞書順に出力
        for (String name : membershipSet) {
            System.out.println(name);
        }
    }
}

//```