//言語：Java
//問題URL：https://paiza.jp/works/mondai/sequence_search_problems_advanced/sequence_search_problems_advanced__range_step0
//コメント：  
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
   
     Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();
     int x=sc.nextInt();
     
     int[] a =new int[n];
     
     for (int i=0;i<n ;i++ )
    {
        a[i]=sc.nextInt();
    }
     
     
    
     int max=0,ans=0;
     for (int i=0;i<n ;i++ )
     {
         if(a[i]>=x)
         max++;
         
         
         ans=Math.max(ans,max);
         
         if(a[i]<x)
         max=0;
         
         
         
      
      
     }
     System.out.println(ans);
     
    }
}
//```