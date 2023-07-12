//言語：Java
//問題URL：https://paiza.jp/works/mondai/dateset/working_day_1
//コメント:少し参考 https://qiita.com/yama-t/items/74522560cc3848a9d8cf
//```Java
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
public class Main {
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int m=sc.nextInt();
        int d=sc.nextInt();
        var s=sc.next();
        
        
        switch(s)
        {
            
            case "FRI" -> d+=3;
            case "SAT" -> d+=2;
            default ->  ++d;
            
        }
        
        int lim=31;
            switch(m)
        {
            
            case 2 -> lim=28;
            case 4,6,9,11 -> lim=30;
            default ->  lim=31;
            
        }
        
        if(d>lim)
        {
            
            m=m==12?1:m+1; ;
            
            
            d=d-lim;
            
        }
        
        System.out.println(m+"月"+d+"日");
        
        
        
        /*
        M月D日d曜日の翌営業日の日付を表示してください。

営業日には、次のルールがあります。

・営業日は、月曜日から金曜日とし、休業日は、土曜日と日曜日とします。
・休業日は土曜日と日曜日のみです。例えば、祝日の「海の日」は月曜日ですが、営業日とします。

日付には、次のルールがあります。

・全ての年の2月28日の翌日は、3月1日とします。うるう年は考慮しません。
        */

    
    }

}
//```