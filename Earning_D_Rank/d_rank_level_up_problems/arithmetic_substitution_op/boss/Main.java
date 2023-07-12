//言語：Java
//問題URL：https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__arithmetic_substitution_op_boss
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        /*
変数 N を 0 で初期化する
N に 3,286 を足した値を N へ代入する
N に 4,736 をかけた値を N へ代入する
N を 12,312 で割った余りを N へ代入する
N を出力する
*/
        
        int n=0;
        n+=3286;
        n*=4736;
        n%=12312;
  
        System.out.println(n);
       
    }
}
//```