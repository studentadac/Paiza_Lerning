//言語：Java
//問題URL：https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_simulation_boss
//コメント 配列だと参照渡しになるようで詰まっていた 変数でゴリゴリ書いて無理やり解いた
// コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
       
       /*カウンター魔法を得意とするパイザ君は、同じくカウンター魔法を使うモンスターと戦っています
       。バトルはターン制で、パイザ君が先攻で、パイザ君とモンスターで交互に魔法を使い合います。
パイザ君の魔法は 1 回目と 2 回目に使うときにはダメージ 1 ですが、
3 回目以降の n 回目には、(モンスターから受けた (n - 1) 回目の攻撃のダメージ) + (モンスターから受けた (n - 2) 回目の攻撃のダメージ) のダメージを与えます。
モンスターの魔法はこれよりも強力で、 1 回目と 2 回目には同じくダメージ 1 ですが、
3 回目以降の n 回目には、 (パイザ君から受けた (n - 1) 回目の攻撃のダメージ) * 2 + (パイザ君から受けた (n - 2) 回目の攻撃のダメージ) のダメージを与えます。

パイザ君は自分がどれくらいモンスターの攻撃を耐えられるか知りたいと思っています。
パイザ君の体力を H として、両者が同じ魔法を使い続けたとき、モンスターの何回目の攻撃でパイザ君の体力が 0 以下になるかを出力してください。

*/
       
      Scanner sc = new Scanner(System.in);
      
      
        var h = sc.nextInt();
        int cnt=2;
        h-=2;
        
int DamageTakenByPaizaBefore2=1;
int DamageTakenByPaizaBefore1=1;


int DamageTakenByMonsBefore2=1;
int DamageTakenByMonsBefore1=1;


  while(h>0 )
        {
         int paizaAtacck=DamageTakenByPaizaBefore2+DamageTakenByPaizaBefore1;//paizaの攻撃
         
         int monsAttack= DamageTakenByMonsBefore2+DamageTakenByMonsBefore1*2;//モンスターの攻撃
         h-=monsAttack;
         cnt++;
         

         DamageTakenByMonsBefore2=DamageTakenByMonsBefore1;
         DamageTakenByMonsBefore1=paizaAtacck;
         
         
         DamageTakenByPaizaBefore2=DamageTakenByPaizaBefore1;
         DamageTakenByPaizaBefore1=monsAttack;
            
        }

        System.out.println(cnt);
    }
    
    
}
//````