//言語：Java
//問題URL：https://paiza.jp/works/mondai/list_advanced/list_advanced__problems_step3
//コメント：両端キューを使用するかや片方向リストを右と左の二つにわけて後で合計する解法でもとけると思います
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var list=new LinkedList<Long>();
        int n=sc.nextInt();
        
        for (int i=0;i<n ;i++ )
        {
            String s=sc.next();
            long num=0;
            if(s.substring(0,3).equals("ADD"))
             num=sc.nextLong();
            
  //          else
//            System.out.println(s);
            switch (s) 
            {
                case  "ADD_RIGHT"  ->list.addLast(num);
                case  "ADD_LEFT"  ->list.addFirst(num);
                case  "REMOVE_RIGHT"->list.removeLast();
                case "REMOVE_LEFT"->list.removeFirst();
                
                default ->System.out.println("miss");
                
            }
            
            
           
        }
        long ans=0;
        for (var num:list )
            ans+=num;
            
            System.out.println(ans);
        
    }
}
//```