//言語：Java
//問題URL：https://paiza.jp/works/mondai/drankfast/d16_alphabet_hole
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String zero = "C, E, F, G, H, I, J, K, L, M, N, S, T, U, V, W, X, Y, Z";
        String one = "A, D, O, P, Q, R";
        
        String s=sc.next();
        if(zero.indexOf(s)!=-1)
        System.out.println(0);
        else if(one.indexOf(s)!=-1)
        System.out.println(1);
        else
        System.out.println(2);
        
       // System.out.println("XXXXXX");
    }
}
//```