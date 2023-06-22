//言語：Java
//問題URL：https://paiza.jp/works/mondai/stack_queue/stack_queue__practice_step2
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
        int maxSum=0;//最大値
        int tmp=0;//一時変数
        int left=0;//左端

        for (int i=0;i<n ;i++ )
        {
            int a=sc.nextInt();
            tmp+=a;
            //  System.out.println(tmp);
            //末尾に値を追加
            queue.add(a);


            if(queue.size()>x)//キューのサイズがxより大きくなったら
                //先頭の値を取得して削除
                tmp-=queue.poll();


            //一時変数が最大値なら
            if(tmp>maxSum)
            {
                //最大値に一時変数を代入
                maxSum=tmp;
                //先頭の値を削除せずに取得
                left=queue.peek();


            }

        }

        System.out.println(maxSum+" "+left);

    }
}
//```