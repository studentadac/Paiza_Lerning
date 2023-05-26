//言語：Java
//問題URL：https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_std_in_out_step5
//コメント：
// コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
       
        for (int i=0;i<n ;i++ ) 
        {
          System.out.print("paiza");
          System.out.print( i<n-1?" ":"\n"    );
        }
    
    }
}
//```