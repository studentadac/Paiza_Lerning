//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_004/forest_contest_004__four_seasons
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！


        
        Scanner sc = new Scanner(System.in);
        var s = sc.nextInt();
        String ans;
        if(s==12||s<=2)
        ans="winter";
        else if(  s<=5 )
        ans="spring";
        else if(s<=8   )
        ans="summer";
        else
        ans="autumn";
        
        
        System.out.println(ans);
        /* 春 ： 3 ~ 5 月の期間
・ 夏 ： 6 ~ 8 月の期間
・ 秋 ： 9 ~ 11 月の期間
・ 冬 ： 12 ~ 2 月の期間*/
        
    }
}
//```