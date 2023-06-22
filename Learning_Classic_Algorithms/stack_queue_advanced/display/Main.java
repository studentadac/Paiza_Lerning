//言語：Java
//問題URL：https://paiza.jp/works/mondai/stack_queue_advanced/stack_queue_advanced__three_queue
//コメント： 
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
       
        var queue = new ArrayDeque<Integer>(); 
   
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n ;i++ ) 
        {
            String s=sc.next();
            int x=sc.nextInt();
            
            if(s.equals("add"))
            queue.add(x);
            
            else
            for (int j=0;j<x ;j++ )
            queue.poll();
            
            
        }
        
        
        while(!queue.isEmpty())
        System.out.println(queue.poll());
      
    }
}
//```