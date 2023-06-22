//言語：Java
//問題URL：https://paiza.jp/works/mondai/stack_queue_advanced/stack_queue_advanced__tundoku
//コメント： 回答を見て解きました
//コード：
//```Java
import java.util.*;
 public class Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
         //     int k=sc.nextInt();
         var stack = new ArrayDeque<Integer>();
         int sum=0;
         for (int i=0;i<n ;i++ )
         {
             String s=sc.next();
             int page =sc.nextInt();

             if(s.equals("buy_book"))
             {
                 sum+=page;
                 stack.push(page);
             }
             else
             {
                 sum-=page;
                 while(page!=0)
                 {
                     // System.out.println(stack.peek());
                     if(stack.peek()>page)
                     {
                         int x=stack.pop()-page;
                         stack.push(x);
                         page=0;
                     }
                     else
                         page-=stack.pop();
                     //    System.out.println(stack.size());
                 }
             }
             // System.out.println(sum);
             //  System.out.println(stack.size());
         }
         System.out.println(stack.size());
         System.out.println(sum);
     }
 }

//```