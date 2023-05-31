//言語：Java
//問題URL：https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_string_step3
//コメント：
// コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = (s.charAt(0)-'0')+(s.charAt(3)-'0');
        int b=(s.charAt(1)-'0')+(s.charAt(2)-'0');


        System.out.print(a);
        System.out.println(b);
    }
}
//```