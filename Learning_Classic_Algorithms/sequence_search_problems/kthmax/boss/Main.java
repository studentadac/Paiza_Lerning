//言語：Java
//問題URL：https://paiza.jp/works/mondai/sequence_search_problems/sequence_search_problems_kthmax_boss
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int [] scores=new int[n];
      
     int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i=0;i<n ;i++ ) 
        {
   
            scores[i]=sc.nextInt();
  
        }
        Arrays.sort(scores);
        
        int k=sc.nextInt();
        System.out.println(scores[n-k]);
       
    }
}
//```