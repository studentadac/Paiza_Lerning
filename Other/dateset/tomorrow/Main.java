//言語：Java
//問題URL：https://paiza.jp/works/mondai/dateset/days_in_a_month
//コメント:参考 https://www.javadrive.jp/start/calendar/index4.html https://www.javadrive.jp/start/calendar/index3.html
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
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(y, m-1, d);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        
        System.out.println(calendar.get(Calendar.YEAR)
    +" "+ (calendar.get(Calendar.MONTH) + 1)
    +" " + calendar.get(Calendar.DATE));

        




    }
}
//```