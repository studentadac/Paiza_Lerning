//言語：Java
//問題URL：https://paiza.jp/works/mondai/stack_queue/stack_queue__common_step1
//コメント： 
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
          // キューの作成
        var queue = new LinkedList<Integer>();

         Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n);
        
        for (int i=0;i<n ;i++ )
        queue.add(sc.nextInt());
        sc.close();

      

        // キューから要素を取り出す
        while (!queue.isEmpty()) {
            int element = queue.poll();
            System.out.println( element);
        }
    }
}
//```