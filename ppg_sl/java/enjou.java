//言語：Java
//問題URL：https://paiza.jp/works/mondai/ppg_sl_java/ppg_sl_java__enjou
//コメント：
//コード：
//```Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int due = scanner.nextInt();
        scanner.close();

        if (due<=3) {
            System.out.println("BOMB");
            System.exit(0);
        }

        System.out.println("ONGOING");
    }
}
//```