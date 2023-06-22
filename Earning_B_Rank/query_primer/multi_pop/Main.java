//言語：Java
//問題URL：https://paiza.jp/works/mondai/query_primer/query_primer__multi_pop
//コメント： 
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var queue = new ArrayDeque<Integer>();
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();

        for (int i=0;i<n ;i++ )
        {
            int s=sc.nextInt();
            queue.add(s);
        }
        for (int i=0;i<k ;i++ )
        {
            String x=sc.next();
            if( queue.size()>0&&x.equals("pop")  )
                queue.poll();

            else if(x.equals("show"))
            {
                var itr =  queue.iterator();
                while (itr.hasNext()) {
                    System.out.println(itr.next());
                }
            }
        }
    }
}
//```