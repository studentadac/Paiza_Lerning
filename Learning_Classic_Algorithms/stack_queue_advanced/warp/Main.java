//言語：Java
//問題URL：https://paiza.jp/works/mondai/stack_queue_advanced/stack_queue_advanced__warp
//コメント： 回答を見て解きました
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        
    int[][] map=new int[n+1][k+1];
    for (int i=0;i<n ;i++ ) 
    for (int j=0;j<k ;j++ )
    map[i][j]=sc.nextInt()-1;
    
    
      
    
    
    var queue = new ArrayDeque<Integer>();
    var stack = new ArrayDeque<Integer>();
   // int myLocation=map[0][0];
   // stack.push(map[0][0]);
   
 
    int now=0;
    stack.push(now);
  
    
        for (int i=0;i<k ;i++ )
        {
          
            if(    map[now][i]==-2           )
            {
                stack.pop();
                now=stack.peek();
                
            }
            
            
       
            else
            {
               now=map[now][i];
               stack.push(now);
            } 
            queue.add(now);
       
        }
        
        
         while(!queue.isEmpty())
        {
           System.out.println(queue.poll()+1);
        }
    
    }
}
//```