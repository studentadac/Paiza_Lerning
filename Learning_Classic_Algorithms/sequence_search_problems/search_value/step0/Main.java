//言語：Java
//問題URL：https://paiza.jp/works/mondai/sequence_search_problems/sequence_search_problems_search_value_step0
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n ;i++ )
        {
            a[i]=sc.nextInt();
        }
        
        int k=sc.nextInt();

          System.out.println(
            
            
            Arrays.
            stream(a).
            filter(num -> num == k).
            count()
            );
    }
}
//```