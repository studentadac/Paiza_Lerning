//言語：Java
//問題URL：https://paiza.jp/works/mondai/drankfast/d18_tgif
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
      
        
        var s=sc.next();
      
        String ans;
        ans= s.equals("Friday")?"TGIF":"Still "+s;
        
        
        System.out.println(ans);
        
       
    }
}
//```