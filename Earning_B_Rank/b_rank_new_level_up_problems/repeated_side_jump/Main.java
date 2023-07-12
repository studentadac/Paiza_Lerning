//言語：Java
//問題URL：https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__repeated_side_jump
//コメント：よくわからないけどなぜか解けた
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var n=sc.nextLong();
        var x=sc.nextLong();
        var k=sc.nextLong();

        var distance= k-n*4;//延長された左端を往復する区間
        //System.out.println(distance);
        long ans=0;
        
        ans+=(distance+1)/4*2*x;//波長4で割る、往復ごとにxは二回繰り返す +1はつじつま合わせ
        if(k%4==3)//最後が左端なら最後だけxは繰り返さない
            ans-=x;

        System.out.println(ans);


    }
}
//```