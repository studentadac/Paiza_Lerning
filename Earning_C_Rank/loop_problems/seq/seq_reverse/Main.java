//言語：java
//問題URL：https://paiza.jp/works/mondai/loop_problems/loop_problems__seq_reverse

//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        final int n=sc.nextInt();
        List<Integer> list = new ArrayList<>(n);
        for(int i=0;i<n;i++)
        {
            list.add(sc.nextInt());
        }
        sc.close();

        Collections.reverse(list);
        for(Integer num:list)
        {
            System.out.println(num);
        }
       
    }
}
//```