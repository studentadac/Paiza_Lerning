//言語：Java
//問題URL：https://paiza.jp/works/mondai/class_primer/class_primer__heros
//コメント：CharGPTによる文字数省略
//コード：
//```Java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] chars = new int[n][7]; // キャラクターのステータスを格納する2次元配列

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 7; j++) {
                chars[i][j] = sc.nextInt();
            }
        }

        while (k-- > 0) {
            int toI = sc.nextInt() - 1;
            char event = sc.next().charAt(0);

            switch (event) {
                case 'l':
                    for (int i = 1; i < 7; i++) {
                        chars[toI][i] += sc.nextInt();
                    }
                    chars[toI][0]++;
                    break;
                case 'm':
                    chars[toI][1] += sc.nextInt();
                    chars[toI][2] += sc.nextInt();
                    break;
                case 'r':
                    chars[toI][3] += sc.nextInt();
                    chars[toI][4] += sc.nextInt();
                    break;
                case 's':
                    chars[toI][5] += sc.nextInt();
                    break;
                case 'p':
                    chars[toI][6] += sc.nextInt();
                    break;
                default:
                    System.out.println("miss");
            }
        }

        sc.close();

        for (int i = 0; i < n; i++) {
            System.out.println(chars[i][0] + " " + chars[i][1] + " " + chars[i][2] + " " +
                               chars[i][3] + " " + chars[i][4] + " " + chars[i][5] + " " + chars[i][6]);
        }
    }
}

//```