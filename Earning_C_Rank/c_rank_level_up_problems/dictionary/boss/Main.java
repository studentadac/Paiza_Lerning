//言語：Java
//問題URL：https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_dictionary_boss
//コメント
// コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        
/*
p 人のグループ A , q 人のグループ B , r 人のグループ C があります。
各グループのメンバーにはそれぞれ番号がつけられており、
A グループの i 番目の人は B グループの j 番目の人に仕事を任せ
、 B グループの j 番目の人は与えられた仕事を C グループの k 番目の人に任せます。
すると結局、 A グループの i 番目の人の仕事をするのは C グループの k 番目の人だということになります。

パイザ君は A グループの各人の仕事を結局 C グループの誰が行うことになるのか知りたがっています。
A グループの人のそれぞれが最終的に C グループの誰に仕事を頼むことになるのかを、
A グループの人の番号が小さい順に p 行出力してください。
*/


        Scanner sc = new Scanner(System.in);
        var p = sc.nextInt();
        var q = sc.nextInt();
        var r = sc.nextInt();
        
        var a=new TreeMap<Integer,Integer>();

        for (int i=0;i<p ;i++ )
        {

            a.put( sc.nextInt(), sc.nextInt());

        }
        var b=new HashMap<Integer,Integer>();

        for (int i=0;i<q ;i++ )
        {

            b.put( sc.nextInt(), sc.nextInt());

        }
        for(   var val : a.entrySet()  )
            System.out.println(val.getKey()+" "+ b.get( val.getValue())  );
    }
}
//````