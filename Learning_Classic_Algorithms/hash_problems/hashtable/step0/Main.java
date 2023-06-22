//言語：Java
//問題URL：https://paiza.jp/works/mondai/hash_problems/hash_problems__hashtable_step0
//コメント： 
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        
        int[] hash=new int[10];
        for (int i=0;i<10 ;i++ )
        hash[i]=-1;
        
        
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n ;i++ )
        {
            int x=sc.nextInt();
          
            
           for (int j=0;j<10 ;j++ ) 
            {
                if(      hash[(x+j)%10]==-1  )
                {
                    hash[(x+j)%10]=x;
                    break;
                }
                
            }
   
            
        }
        
        
        for (int i=0;i<10 ;i++ ) 
        
        {
            
            System.out.println(hash[i]);
        }
        
        
    }
}
//```