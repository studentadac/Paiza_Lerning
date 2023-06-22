//言語：Java
//問題URL：https://paiza.jp/works/mondai/stack_queue/stack_queue__queue_step2
//コメント： 
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int q=sc.nextInt();
        var queue = new ArrayDeque<String>();
        for (int i=0;i<q ;i++ )
        {
            int a=sc.nextInt();

            if(a==1)
                //先頭に値を追加
                queue.add(sc.next());

            else
                //先頭の値を削除
                 System.out.println( queue.poll());
                 
            Iterator<String> itr = queue.iterator();
            while (itr.hasNext()) {
                System.out.print(itr.next());

                if (itr.hasNext())
                    System.out.print(" ");
            }
            System.out.println();//queueのサイズが0の場合でも改行     
               

        }


    }
}
//```