//言語：Java
//問題URL：https://paiza.jp/works/mondai/stack_queue_advanced/stack_queue_advanced__crowded_escalator
//コメント： 
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        var queue = new ArrayDeque<Integer>();
        int sum=0;

        for (int j=0;j<n ;j++ )
        {
            String s=sc.next();
            int num=sc.nextInt();
            if(s.equals("ride") )
            {
                for (int i=0;i<num ;i++ )
                {
                    int weight=sc.nextInt();
                    if((sum+weight)<=x )
                    {
                        queue.add(weight);
                        sum+=weight;
                    }
                }
            }
            else
            {

                for (int i=0;i<num ;i++ )
                {
                    if(queue.isEmpty())
                        break;

                    sum-=queue.poll();


                }
            }
        }
        System.out.println(queue.size());
        System.out.println(sum);
    }
}
//```