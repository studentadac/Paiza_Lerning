//言語：Java
//問題URL：https://paiza.jp/works/mondai/prob60/alphabets_large_or_small_9
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
    
        char[] X = sc.nextLine().toCharArray();
        char[] Y = sc.nextLine().toCharArray();
        char[] C = sc.nextLine().toCharArray();
        
        System.out.println(X[0]<=C[0]&&C[0]<=Y[0]);
        
    }
}
//```