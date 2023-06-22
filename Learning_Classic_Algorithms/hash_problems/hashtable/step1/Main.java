//言語：Java
//問題URL：https://paiza.jp/works/mondai/hash_problems/hash_problems__hashtable_step1
//コメント： 
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        
ArrayList<Integer>[] hash = new ArrayList[10];

         for (int i=0;i<10 ;i++ )
        {
            //int x=sc.nextInt();
            
             hash[i] = new ArrayList<Integer>();
            
         //   hash[x%10].add(x);
 
            
        }
        
        
        
        
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n ;i++ )
        {
            int x=sc.nextInt();
            
         //    hash[x%10] = new ArrayList<Integer>();
            
            hash[x%10].add(x);
          
            
          
            
        }
        
        
        for (int i=0;i<10 ;i++ ) 
        
        {
            
            for (int j=0; j<hash[i].size();j++ ) 
           { 
            System.out.print(hash[i].get(j));
            if(j<(hash[i].size()-1))
            System.out.print(" ");
         //   System.out.println( j<(hash[i].size()-1)?" ":"\n"      );
           }
           System.out.println();
        }
        
        
    }
}
//```