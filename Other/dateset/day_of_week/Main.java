//言語：Java
//問題URL：https://paiza.jp/works/mondai/dateset/day_of_week
//コメント:参考 https://www.sejuku.net/blog/20325 https://camp.trainocate.co.jp/magazine/java-simpledateformat/
//```Java
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int y=sc.nextInt();
        int m=sc.nextInt();
        int d=sc.nextInt();
        Locale jp = new Locale("ja", "JP", "JP");
        Calendar calendar = Calendar.getInstance();
        calendar.set(y, m-1, d);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE", jp);
        System.out.println(sdf.format(calendar.getTime())); 
        
    }
}
//```