//言語：Java
//問題URL：https://paiza.jp/works/mondai/stack_queue/stack_queue__practice_step6
//コメント： 
//コード：
//```Java
import java.util.*;
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
            int s=sc.nextInt();
            
            
   
            while(stack.size()>0&&stack.peek()==s )
            {
                s+=stack.pop();
                
            }
            
            
            stack.push(s);
        }
        
             var itr = stack.iterator();

            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        
        
       
    }
}
//```