//言語：Java
//問題URL：https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__super_long_int
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans=0;
        for (int i=0;i<4;i++ ) 
        {
           // System.out.println(s.substring(i*4,i*4+4 ));
            ans+=Integer.parseInt(s.substring(i*8,i*8+8 ));
            
        }
        System.out.println(ans);
        
    }
}
//```