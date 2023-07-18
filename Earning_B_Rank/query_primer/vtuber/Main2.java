//言語：Java
//問題URL：https://paiza.jp/works/mondai/query_primer/query_primer__vtuber
//コメント：chatgpt使用 模範解答のデータ入力前
//コード：
//```Java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        
        // Mapを用意してsuperchatの総額を管理
        Map<String, Long> superchatMap = new HashMap<>();
        // Setを用意してメンバーシップ加入者を管理
        Set<String> membershipSet = new TreeSet<>();
        
        for (int i = 0; i < N; i++) {
            String[] event = sc.nextLine().split(" ");
            String name = event[0];
            
            if (event[1].equals("give")) {
                long money = Long.parseLong(event[2]);
                superchatMap.put(name, superchatMap.getOrDefault(name, 0L) + money);
            } else if (event[1].equals("join") && event[2].equals("membership!")) {
                membershipSet.add(name);
            }
        }
        
        // superchatの総額を降順にソート
        List<Map.Entry<String, Long>> superchatList = new ArrayList<>(superchatMap.entrySet());
        superchatList.sort(Map.Entry.<String, Long>comparingByValue().reversed()
            .thenComparing(Map.Entry.comparingByKey()));
        
        // superchatの総額が同じ場合は名前を辞書順降順にソート
        superchatList.sort((entry1, entry2) -> {
            if (entry1.getValue().equals(entry2.getValue())) {
                return entry2.getKey().compareTo(entry1.getKey());
            }
            return 0;
        });
        
        // superchatの総額が高い順に出力
        for (Map.Entry<String, Long> entry : superchatList) {
            System.out.println(entry.getKey());
        }
        
        // メンバーシップ加入者を辞書順昇順に出力
        for (String name : membershipSet) {
            System.out.println(name);
        }
    }
}
//```