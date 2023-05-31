//言語：Java
//問題URL：https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_string_boss
//コメント：
// コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        
        int n= sc.nextInt();
        for (int i=0;i<n ;i++ ){ 
        String line = sc.next();
        String[]s =line.split(":");
        
        int h=Integer.parseInt(s[0]);
        h+=sc.nextInt();
        
        int m =Integer.parseInt(s[1]);
        m+=sc.nextInt();
        h=   (h+(m/60))%24;
        m%=60;
        
        String hs = String.valueOf(h);
        String ms = String.valueOf(m);

        
        System.out.println(   "0".repeat(2-hs.length()) +   hs+":"+"0".repeat(2-ms.length()) +    ms);
        }
    }
}
//```