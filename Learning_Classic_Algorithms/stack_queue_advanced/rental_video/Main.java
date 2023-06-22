//言語：Java
//問題URL：https://paiza.jp/works/mondai/stack_queue_advanced/stack_queue_advanced__rental_video
//コメント： Java 文字列比較のやり方を時々忘れる 
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
            stack.push(sc.nextInt());
          //  System.out.println(stack.size());
        }
        
        int k=sc.nextInt();
     //   var stack = new ArrayDeque<Integer>();
     //   System.out.println(k);
        for (int i=0;i<k ;i++ )
        {
            String s=sc.next();
            //System.out.println(s);
            if(s.equals("return"))
            {
                int num=sc.nextInt();
               stack.push(num);
      //         System.out.println(num);
            }
            
            else
            stack.pop();
            
           // System.out.println(stack.size());
            
        }
    //    System.out.println(stack.size());
        while(!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
        
        
    }
}
//```