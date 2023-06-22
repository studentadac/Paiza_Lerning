//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_005/forest_contest_005__d_inverse
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String str = sc.next();//文字列を読み込む
    //    System.out.println(str);
        StringBuilder strb = new StringBuilder(str);//変更可能な方に変換
        str = strb.reverse().toString();//reverseで変換して文字列に戻す
        System.out.println(str);//出力
    }
}

//```