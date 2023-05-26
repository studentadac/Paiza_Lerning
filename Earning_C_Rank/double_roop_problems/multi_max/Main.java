//言語：Java
//問題URL：https://paiza.jp/works/mondai/double_roop_problems/double_roop_problems__multi_max
//コメント：
// コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[]=new int [n];

        for (int i=0;i<n ;i++ )
        {
             a[i]=sc.nextInt();
        }
        int b[]=new int [k];
        
        int max=-100*100;
        for (int i=0;i<k ;i++ )
        {
             b[i]=sc.nextInt();
             for (int j=0;j<n ;j++ ) 
             {
                 max=Math.max( b[i]*a[j] ,max  );
             }
             
        }
        
        System.out.println(max);
    }
}
//```