//言語：Java
//問題URL：https://paiza.jp/works/mondai/stack_queue/stack_queue__stack_step2
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
        var stack = new ArrayDeque<String>();
        for (int i=0;i<q ;i++ )
        {
            int a=sc.nextInt();

            if(a==1)
                //末尾に値を追加
                stack.push(sc.next());

            else
                //末尾の値を削除
                 System.out.println( stack.pop());
                 
            Iterator<String> itr = stack.descendingIterator();
             while (itr.hasNext()) {
                System.out.print(itr.next());

                if (itr.hasNext())
                    System.out.print(" ");
            }
            System.out.println();//stackのサイズが0の場合でも改行     
               

        }


    }
}
//```