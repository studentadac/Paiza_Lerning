//言語：Java
//問題URL：https://paiza.jp/works/mondai/drankfast/d19_hearing_range
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
      
        
        var f=sc.nextInt();
        String ans;
        
        if(  20<=f&&f<=15000 )
        ans="yes";
        
        else if(  15000<f &&f<=20000)
        ans="not sure";
        
        else
        ans="no";
       
        
        
        System.out.println(ans);
        /*
        ・20 ≤ f ≤ 15000 のとき、yes
・15000 < f ≤ 20000 のとき、not sure
・それ以外のとき、no
        */
       
    }
}
//```