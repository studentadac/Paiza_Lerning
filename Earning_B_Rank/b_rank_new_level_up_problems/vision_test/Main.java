//言語：Java
//問題URL：https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__vision_test
//コメント：
//コード：
//```Java

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
     

        LinkedHashMap<String, Integer> visionMap = new LinkedHashMap<>();
        visionMap.put("TA", 0);
        visionMap.put("TB", 0);
        visionMap.put("TC", 0);
        visionMap.put("TD", 0);
        visionMap.put("TE", 2);
        
        LinkedHashMap<String, Integer> failedMap = new LinkedHashMap<>();
        failedMap.put("TA", 0);
        failedMap.put("TB", 0);
        failedMap.put("TC", 0);
        failedMap.put("TD", 0);

        for (int i = 0; i < N; i++) {
            String test = sc.next();
            String result = sc.next();
          
            if (result.equals("ok")&&(failedMap.get(test))<2) {
                visionMap.put(test, visionMap.get(test) + 1);
            } else {
                failedMap.put(test, failedMap.get(test) + 1);
            }
        }

        for (var entry : visionMap.entrySet()) {
            if (entry.getValue() >= 2) {
                System.out.println(entry.getKey().charAt(1));
                return;
            }
        }

      
    }
}


//```