//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_004/forest_contest_004__rps_easy
//コメント：前問を流用
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        var rps=new HashMap<String,String  >(3)
        {{
    put("R","P");
    put("P", "S");
    put("S", "R");
   
        }};
        
        
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        System.out.println(rps.get(s));
        
        
        
    }
}
//```