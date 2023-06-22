//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_001/forest_contest_001__d_sports
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        var sport=new HashMap<String,Integer  >(6)
        {{
    put("baseball",9);
    put("soccer", 11);
    put("rugby", 15);
    put("basketball",5);
    put("volleyball",6);
            
        }};
        
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        System.out.println(sport.get(s));
        
        
        
    }
}
//```