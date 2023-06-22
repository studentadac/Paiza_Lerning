//言語：Java
//問題URL：https://paiza.jp/works/mondai/stack_queue_advanced/stack_queue_advanced__three_queue
//コメント： 
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        final int x=3;
       ArrayDeque<Integer>[] queue = (ArrayDeque<Integer>[]) new ArrayDeque[x];
       
       for (int i=0;i<x ;i++ ) 
        queue[i] = new ArrayDeque<>();
   
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n ;i++ ) 
        {
            String line = sc.next();
            int s=sc.nextInt()-1;
            if(line.equals("push"))
            {
                int addNum =sc.nextInt();
                queue[s].add(addNum);
              
            }
            else
            {
                queue[s].poll();
            }
            
        }
        
         for (int i=0;i<x ;i++ ) 
        while(!queue[i].isEmpty())
        System.out.println(queue[i].poll());
      
    }
}
//```