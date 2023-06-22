//言語：Java
//問題URL：https://paiza.jp/works/mondai/stack_queue/stack_queue__practice_step5
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
        int humans=0;
        int begin=0;


        while(sc.hasNext())
        {
            int last=sc.nextInt();
            humans++;

            for (int i=begin;i<last-1 ;i++)
            {
                queue.add(0);
            }

            queue.add(1);


            while(queue.size()>x)    //キューのサイズがxより大きくなったら
            {  //先頭の値を取得して削除
                humans -= queue.poll();
            }
            System.out.println(humans);
            begin=last;
        }
    }
}
//```