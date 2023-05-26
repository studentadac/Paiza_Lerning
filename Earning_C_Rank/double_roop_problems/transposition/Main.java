//言語：Java
//問題URL：https://paiza.jp/works/mondai/double_roop_problems/double_roop_problems__transposition
//コメント：
// コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] a=new int [n][k];

        for (int i=0;i<n ;i++ )
        {
            for (int j=0;j<k ;j++ )
            {  a[i][j]= sc.nextInt();}
            
        }


             for (int i=0;i<k ;i++ )
        {
            for (int j=0;j<n ;j++ )
            {
                System.out.print(a[j][i]);
                
                if(j<n-1)
                System.out.print(" ");
            
            ;}
            System.out.println("");
        }  
        
        
        
    }
}
//```