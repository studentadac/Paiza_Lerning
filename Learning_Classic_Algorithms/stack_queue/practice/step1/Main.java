//言語：Java
//問題URL：https://paiza.jp/works/mondai/stack_queue/stack_queue__practice_step1
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
        ArrayDeque<String>[] queue = (ArrayDeque<String>[]) new ArrayDeque[2];
        queue[0] = new ArrayDeque<>();
        queue[1] = new ArrayDeque<>();
        for (int i=0;i<q ;i++ )
        {
            int a=sc.nextInt();

            if(a==1)
            {
                int k=sc.nextInt();
                var x=sc.next();
                queue[k-1].add(x);

            }

            else if(a==2)
            {
                int k=sc.nextInt();
                System.out.println( queue[k-1].poll());

            }
            else
            {
                System.out.println(queue[0].size() +" "+queue[1].size()  );
         /*     for (int j=0;j<2 ;j++ ) 
          { 
              Iterator<String> itr = queue[j].iterator();
            while (itr.hasNext()) {
                System.out.print(itr.next());

                if (itr.hasNext())
                    System.out.print(" ");
            }
              System.out.println();//queueのサイズが0の場合でも改行     
          }
            */
            }
        }
    }
}
//```