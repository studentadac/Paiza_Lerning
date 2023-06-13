//言語：Java
//問題URL：https://paiza.jp/works/mondai/drankfast/d17_noise
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
      
        
        var l=sc.nextInt();
        String ans;
        if(l<30)
        ans="quiet";
        else if(l<50 )
        ans="normal";
        else if(l<70)
        ans="noisy";
        else
        ans="very noisy";
        
        System.out.println(ans);
        
        
        
       // System.out.println("XXXXXX");
       /*・l < 30 のとき、 quiet
・30 ≤ l < 50 のとき、normal
・50 ≤ l < 70 のとき、noisy
・70 ≤ l のとき、 very noisy*/
       
    }
}
//```