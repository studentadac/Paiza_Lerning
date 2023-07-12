//言語：Java
//問題URL：https://paiza.jp/works/mondai/dateset/days_in_a_month
//コメント:改造 https://java-beginner.com/practice-judge-leap-year/
//コード：
//```Java
import java.util.*;
import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class Main {
    
    public static int judge(int year,int month) {
    // オブジェクト生成
    LocalDate localDate = LocalDate.of(year, month, 1);
    // 日数を取得
    int numberOfdays = localDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();
    // 月末の日数を返却
    return numberOfdays;
}
    
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var y=sc.nextInt();
        var m=sc.nextInt();

        System.out.println(judge(y,m));
    }
}
//```