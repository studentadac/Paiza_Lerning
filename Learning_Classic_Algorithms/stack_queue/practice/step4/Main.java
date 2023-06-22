//言語：Java
//問題URL：https://paiza.jp/works/mondai/stack_queue/stack_queue__practice_step4
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
         if(n%2!=0)
       {
           System.out.println("No");
           return;
       }

        
        var queue = new ArrayDeque<Character>();
        
        var s=sc.next().toCharArray();
       
       
       boolean isRight=true;
      
        for (int i=0;i<n ;i++ )
        {
           if(s[i]=='(')
           queue.add(s[i]);
           else
           if( queue.size()==0   )
           {
               isRight=false;
               break;
           }
           
           else
           if( (queue.poll()!='(') )
           {
               isRight=false;
               break;
           }
         
           
           
        }

System.out.println(isRight?"Yes":"No");
       

    }
}
//```