//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_001/forest_contest_001__d_break_time
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
  
        Scanner sc = new Scanner(System.in);
        var s = sc.nextInt();
        
        String ans;
        
        if(s>8)
        ans="60 min";
        else if(s>6)
        ans="45 min";
        else
        ans="no break";
        
        System.out.println(ans);
        
        
        
    }
}


/*
・勤務時間が6時間を超え、8時間以下であるときには、45分
・勤務時間が8時間を超えるときには、60分
*/

//```