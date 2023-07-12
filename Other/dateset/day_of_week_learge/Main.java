//言語：Java
//問題URL：https://paiza.jp/works/mondai/dateset/day_of_week_large
//コメント:
//```Java
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
public class Main {
    
              public static String convertDayOfWeek(String dayOfWeek) {
        switch (dayOfWeek) {
            case "SUNDAY":
                return "日曜日";
            case "MONDAY":
                return "月曜日";
            case "TUESDAY":
                return "火曜日";
            case "WEDNESDAY":
                return "水曜日";
            case "THURSDAY":
                return "木曜日";
            case "FRIDAY":
                return "金曜日";
            case "SATURDAY":
                return "土曜日";
            default:
                return "不明な曜日";
        }
}
        
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        var y=sc.nextLong();
        int m=sc.nextInt();
        int d=sc.nextInt();
        y=y%400+2000;
        LocalDate currentDate  = LocalDate.of(0, m, d);
        LocalDate futureDate = currentDate.plusYears(y);
        DayOfWeek dayOfWeek = futureDate.getDayOfWeek();
        String dayOfWeekName = dayOfWeek.name();

        System.out.println(convertDayOfWeek(dayOfWeekName));

    }

}
//```