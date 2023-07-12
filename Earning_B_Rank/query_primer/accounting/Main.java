//言語：Java
//問題URL：https://paiza.jp/works/mondai/query_primer/query_primer__accounting
//コメント：chatGPTにより作成
//コード：
//```Java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine(); // 改行読み飛ばし

        LinkedHashMap<String, ArrayList<String>> table = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String department = sc.nextLine();
            table.put(department, new ArrayList<>());
        }

        for (int i = 0; i < k; i++) {
            String receipt = sc.nextLine();
            String[] values = receipt.split(" ");
            String department = values[0];
            String orderNumber = values[1];
            String amount = values[2];

            ArrayList<String> departmentRecords = table.get(department);
            departmentRecords.add(orderNumber + " " + amount);
        }

        for (String department : table.keySet()) {
            System.out.println(department);
            ArrayList<String> departmentRecords = table.get(department);
            for (String record : departmentRecords) {
                System.out.println(record);
            }
            System.out.println("-----");
        }
    }
}
//```