//言語：java
//問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__set_step2
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int n=sc.nextInt();
        var set = new LinkedHashSet<Integer>();

        for (int i=0;i<n ;i++ )
        {
            set.add(sc.nextInt());
        }
        StringBuilder sb = new StringBuilder();
        
        for(int num:set)
            sb.append(Integer.toString(num)).append(" ");

        sb.deleteCharAt(sb.length() - 1);
        String result = sb.toString();
        System.out.println(result);

    }
}
//```