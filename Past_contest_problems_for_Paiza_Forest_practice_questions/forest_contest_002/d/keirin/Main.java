//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_002/forest_contest_002__d_keirin
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        
        /*nが
・1のとき、white
・2のとき、black
・3のとき、red
・4のとき、blue
・5のとき、yellow
・6のとき、green
・7のとき、orange
・8のとき、pink
・9のとき、purple*/

       // int n=9;
        String[] a={"white" ,"black" ,"red" ,"blue"
                ,"yellow" ,"green","orange" ,"pink","purple"           } ;


        Scanner sc = new Scanner(System.in);
        var s = sc.nextInt();
        System.out.println(a[s-1]);

    }
}
//```