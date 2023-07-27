//言語：Java
//問題URL：https://paiza.jp/works/mondai/ppg_sl_java/ppg_sl_java__kaidan
//コメント：
//コード：
//```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var n = scanner.nextInt();

        var ans = n + n + n;
        System.out.println(ans);
    }
}
//```