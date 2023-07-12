//言語：Java
//問題URL：https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__get_row_col
//コメント：
//コード：
//```Java

import java.util.*;

public class Main {
    static char change(char x) {
        return x == '#' ? '.' : '#';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        var map = new char[h][w];

        for (int i = 0; i < h; i++) {
            map[i] = sc.next().toCharArray();
        }

        int y = sc.nextInt();
        int x = sc.nextInt();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i == y || j == x || Math.abs(i - y) == Math.abs(j - x)) {
                    map[i][j] = change(map[i][j]);
                }
            }
        }

        for (int i = 0; i < h; i++) {
            System.out.println(map[i]);
        }
    }
}



//```