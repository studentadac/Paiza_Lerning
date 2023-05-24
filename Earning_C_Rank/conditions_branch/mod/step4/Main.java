//言語：java
//問題URL：https://paiza.jp/works/mondai/conditions_branch/conditions_branch__mod_step4
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        /*答えとなる曜日Sを短縮した表記で出力してください。
        具体的に、日曜日の場合はSun、月曜日の場合はMon、
        火曜日の場合はTue、水曜日の場合はWed、木曜日の場合はThu
        、金曜日の場合はFri、土曜日の場合はSatを出力してください。末尾に改行を入れ、余計な文字、空行を含んではいけません。
*/
        Scanner sc = new Scanner(System.in);
        var line = sc.nextInt();
        sc.close();
        String ans;
        
        switch(line%7){
        case 1->ans="Sun";
        case 2->ans="Mon";
        case 3->ans="Tue";
        case 4->ans="Wed";
        case 5->ans="Thu";
        case 6->ans="Fri";
        default ->ans="Sat";
        }
        System.out.println(ans);
        
    }
}
//```