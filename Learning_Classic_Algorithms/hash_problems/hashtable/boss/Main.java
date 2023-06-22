//言語：Java
//問題URL：https://paiza.jp/works/mondai/hash_problems/hash_problems__hashtable_boss
//コメント： 
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        
ArrayList<Integer>[] hash = new ArrayList[100];

         for (int i=0;i<100 ;i++ )
        {
            //int x=sc.nextInt();
            
             hash[i] = new ArrayList<Integer>();
            
         //   hash[x%10].add(x);
 
            
        }
        
        
        
        
        
        Scanner sc = new Scanner(System.in);
         int a=sc.nextInt();
          int b=sc.nextInt();
        
        int n=sc.nextInt();
        for (int i=0;i<n ;i++ )
        {
            
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x==1)
            
         //    hash[x%10] = new ArrayList<Integer>();
            {
            hash[(a*y+b)%100].add(y);
            }
            
            else
          {  
              boolean is=false;
              for (int j=0; j<hash[(a*y+b)%100].size();j++ ) 
           { 
           
           
           if(hash[(a*y+b)%100].get(j)==y)
           {
               is=true;
               break;
           }
           
           
           }
           
           System.out.println(is? "Yes":"No"  );
           
           
          }
            
          
            
        }
        
        
        for (int i=0;i<100 ;i++ ) 
        
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