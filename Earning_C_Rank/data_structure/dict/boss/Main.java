//言語：java
//問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__dict_boss
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        var map = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        final int n=sc.nextInt(),m=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            String a=sc.next();
            if (!map.containsKey(a))
                map.put(a,i+1);
        }

        for(int i=0;i<m;i++)
        {
            String t=sc.next();
            if (map.containsKey(t)) {
                System.out.println(map.get(t));
            }
            else {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
//```