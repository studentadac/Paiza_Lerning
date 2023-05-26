//言語：Java
//問題URL：https://paiza.jp/works/mondai/double_roop_problems/double_roop_problems__multiplication
//コメント：
// コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int [n];

        for (int i=0;i<n ;i++ )
        {
             a[i]= sc.nextInt();
        }
        
         for (int i=0;i<n ;i++ )
        {
            for (int j=0;j<n ;j++ )
            {
                System.out.print(a[i]*a[j]);
                if(j<n-1)
                System.out.print(" ");
                else
                System.out.println("");
            }
        }
          
    }
}
//```