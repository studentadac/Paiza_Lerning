//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_003/forest_contest_003__d_reverse
//コメント：参考 https://www.delftstack.com/ja/howto/java/how-to-reverse-a-string-in-java/
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
	//	System.out.println(str);
		StringBuilder strb = new StringBuilder(str);
		str = strb.reverse().toString();
		System.out.println(str);
    }
}
//```