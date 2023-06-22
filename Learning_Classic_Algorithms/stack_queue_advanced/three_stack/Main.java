//言語：Java
//問題URL：https://paiza.jp/works/mondai/stack_queue_advanced/stack_queue_advanced__three_stack
//コメント： 
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer>[] stack = (ArrayDeque<Integer>[]) new ArrayDeque[3];
        stack[0] = new ArrayDeque<>();
        stack[1] = new ArrayDeque<>();
        stack[2] = new ArrayDeque<>();
        
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n ;i++ )
        {
            var q=sc.next();
            //    System.out.println(q);
            if(q.equals("push"))
            {
                int x=sc.nextInt();
                int y=sc.nextInt();
                stack[x-1].push(y);
                //   System.out.println(x-1+" "+y);
            }

            else
            {
                int x=sc.nextInt();
                if(stack[x-1].size()>0)
                    stack[x-1].pop();
            }
        }
        
        for (int j=0;j<3 ;j++ )
        {
            while(stack[j].size()>0)
                System.out.println(stack[j].pop());
        }
        
    }
}
//```