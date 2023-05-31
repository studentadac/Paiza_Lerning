//言語：Java
//問題URL：https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_simulation_step2
//コメント
// コード：
//```Java
import java.util.*;
public class Main {
    /*パイザ君と霧島京子は最初どちらも数 1 をもっています。
    パイザ君は自分の番が来ると 、自分のもっている数の a 倍を霧島京子の数に足してあげます。
    霧島京子は自分の番が来ると 、自分のもっている数を b で割った余りをパイザ君の数に足してあげます。
    この手続きをパイザ君の番から始めて、霧島京子の数がnより大きくなるまで繰り返します。

手続きが終わったときのパイザ君の操作回数を求めてください。

*/
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
      
      
        var n = sc.nextInt();
        var a = sc.nextInt();
        var b = sc.nextInt();
        
        int kyoko=1,paiza=1,cnt=0;
        
 
        while(!(kyoko>n))
        {
              kyoko+=paiza*a;
              cnt++;
              paiza+=kyoko%b;
            
            
        }
        System.out.println(cnt);
        

    }
}
//````