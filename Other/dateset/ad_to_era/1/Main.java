//言語：Java
//問題URL：https://paiza.jp/works/mondai/dateset/ad_to_era
//コメント： 引用 https://qiita.com/cress_cc/items/5b46947a0c4cc86eb147
//コード：
//```Java
import java.time.chrono.*;
import java.time.format.*;
import java.time.temporal.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int y=sc.nextInt();
        int m=sc.nextInt();
        int d=sc.nextInt();

    DateTimeFormatter dtf = new DateTimeFormatterBuilder()
        .appendText(ChronoField.ERA, TextStyle.FULL)
        //この行を消去
        .appendLiteral("年")
        .appendValue(ChronoField.MONTH_OF_YEAR)
        .appendLiteral("月")
        .appendValue(ChronoField.DAY_OF_MONTH)
        .appendLiteral("日")
        .toFormatter()
        .withChronology(JapaneseChronology.INSTANCE)
        .withLocale(Locale.JAPAN);
        
        
JapaneseDate jd = JapaneseDate.of(y, m, d);


    System.out.println(dtf.format(jd));

    


    }
}
//```