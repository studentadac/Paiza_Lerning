//言語：Java
//問題URL：https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_for_boss
//コメント：
// コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();
        var m = sc.nextInt();
        var k = sc.nextInt();
        

        for (int i=0;i<n ;i++ ){
            int score=0;
            for (int j=0;j<m ;j++ )
            {if(sc.nextInt()==k)
                score++;
            }
            System.out.println(score);
        }
    }
}
//````