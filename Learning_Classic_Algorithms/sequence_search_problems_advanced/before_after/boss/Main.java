//言語：Java
//問題URL：https://paiza.jp/works/mondai/sequence_search_problems_advanced/sequence_search_problems_advanced__before_after_boss
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
        int m=sc.nextInt();


        int[] a =new int[n];
        int[] b=new int[m];
        for (int i=0;i<n ;i++ )
            a[i]=sc.nextInt();
            
            
            for (int i=0;i<m ;i++ )
            b[i]=sc.nextInt();   
            
            String ans="No";
       for (int i=0;i<n ;i++ )
         {
          
          int sequenceBegin=i;
          
          int j=0;
         while( (sequenceBegin)<n &&j<m     )
            {
                if(a[sequenceBegin]==b[j]     )
                {
                   
                    j++;
                    
                }
                 sequenceBegin++;
                
            }
            if(j==m)
            {
                ans="Yes";
                break;
            }
             
         }
            
            
    
        System.out.println(ans);
    }
}
//```