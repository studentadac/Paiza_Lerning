//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_005/forest_contest_005__d_telework
//コメント：
//コード：
//```Java
/*ある会社では、会社のデスク使用率が 30％を超えるか、
天候が雨の場合にテレワークすることが認められます。会社のデスク使用率a%、天候がbと文字列で与えられるので
、テレワーク可能かどうか答えてください。

*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var n=sc.nextInt();
        String line = sc.next();
        
        System.out.println((n>30||line.equals("rainy"))?"Yes":"No"   );
    }
}

//```