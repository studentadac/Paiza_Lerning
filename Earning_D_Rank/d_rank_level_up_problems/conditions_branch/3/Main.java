//言語：Java
//問題URL：https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__conditions_branch_3
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        var a=sc.nextInt();
        var b=sc.nextInt();
        var c=sc.nextInt();
        var n=c-a*b;
        System.out.println( n>=0?"YES":"NO"  );
    }
}
//```