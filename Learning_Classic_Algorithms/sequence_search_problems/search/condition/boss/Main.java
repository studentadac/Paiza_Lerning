//言語：Java
//問題URL：https://paiza.jp/works/mondai/sequence_search_problems/sequence_search_problems_search_condition_boss
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
      int [] scores=new int[n];
      String[] names=new String[n];
        for (int i=0;i<n ;i++ ) 
        {
            String name=sc.next();
            names[i]=name;
            Integer score=sc.nextInt();
            scores[i]=score;
            
        }
        
        Integer k=sc.nextInt();
        Integer l=sc.nextInt();
       for (int i=0;i<n ;i++ ) 
        {
           
           if(k<=scores[i]&&scores[i]<=l)
           System.out.println(names[i]);
        }
        
        
        
    }
}
//```