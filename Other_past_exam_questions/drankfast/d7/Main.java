//言語：Java
//問題URL：https://paiza.jp/works/mondai/drankfast/d7_pencil
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String line = "6B, 5B, 4B, 3B, 2B, B, HB, F, H, 2H, 3H, 4H, 5H, 6H, 7H, 8H, 9H";
        String[] pencilHardness=line.split(", ");
        


        System.out.println(pencilHardness[sc.nextInt()-1 ]);
    }
}
//```