//言語：Java
//問題URL：https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_std_in_out_step4
//コメント：
// コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int max=0;
        for (int i=0;i<n ;i++ ) 
        {
            max=Math.max(max,sc.nextInt());
        }
        sc.close();
        System.out.println(max);
        
        
    }
}
//```