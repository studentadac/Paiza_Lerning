//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_007/forest_contest_007__temparature
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 最高気温が35度以上の日を猛暑日、30度以上の日を真夏日、25度以上の日を夏日、0度未満の日を真冬日といいます。

        // 猛暑日なら、"extremely hot day"、真夏日なら、"hot summer day"、夏日なら、"summer day"、真冬日なら、"ice day"、それ以外は"normal day"と出力してください。


        Scanner sc = new Scanner(System.in);
        var c = sc.nextInt();
        String ans;
        if(c>=35)
        ans="extremely hot day";
        
        else if(c>=30)
        ans="hot summer day";
        
        else if(c>=25)
        ans="summer day";
        
        else if(c<0)
        ans="ice day";
        
        else
        ans="normal day";
        
        
        
        System.out.println(ans);
    }
}
//```