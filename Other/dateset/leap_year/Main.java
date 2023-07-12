//言語：Java
//問題URL：https://paiza.jp/works/mondai/dateset/leap_year
//コメント： 引用 https://java-beginner.com/practice-judge-leap-year/
//コード：
//```Java
import java.util.*;
import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class Main {
    
    public static boolean judge(int year) {
	// オブジェクト生成
	LocalDate localDate = LocalDate.of(year, 2, 1);
	// 日数を取得
	int numberOfdays = localDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();
	// 日数が29日の場合、trueを返却
	return numberOfdays == 29;
}
    
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var n=sc.nextInt();
        System.out.println(judge(n)?"Yes":"No");
    }
}

//```