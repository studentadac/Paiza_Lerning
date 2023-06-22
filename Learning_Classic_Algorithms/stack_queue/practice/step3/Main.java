//言語：Java
//問題URL：https://paiza.jp/works/mondai/stack_queue/stack_queue__practice_step3
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
        var stack = new ArrayDeque<Integer>();

        for (int i=0;i<n ;i++ )
        {
            //
            String s=sc.next();
            
            if(s.charAt(0)!='+'&&s.charAt(0)!='-'    )
            stack.push(Integer.parseInt(s));
            
            else
            {
                int x=stack.pop();
                int y=stack.pop();
                
                if(s.charAt(0)=='+')
                stack.push(y+x);
                else if(s.charAt(0)=='-')
                stack.push(y-x);
            }
            
        }
        
        System.out.println(stack.peek());
    }
}
//```