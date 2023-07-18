//言語：Java
//問題URL：https://paiza.jp/works/mondai/a_rank_level_up_problems/a_rank_snake_move_step4
//コメント：JavaでつまづいたところはとりあえずChatGPTで埋めて、他の言語は自力で解く予定 https://friend-fairy.com/k_diary/index.html
//コード：
//```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[] s = inputLine.split(" ");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        int n = Integer.parseInt(s[2]);

        int[][] cordb = { {-1, 1}, {1, 1}, {1, -1}, {-1, -1} };
        int[][] direc = { {1, 0}, {0, -1}, {-1, 0}, {0, 1} };

        int circuit = (int) ((Math.sqrt(n) + 1) / 2);
        int pos_of_c = n - (int) Math.pow((circuit * 2 - 1), 2);
        int pos_of_d = pos_of_c / (circuit * 2);
        int pos_of_e = pos_of_c % (circuit * 2);

        int oy = y + cordb[pos_of_d][0] * circuit + direc[pos_of_d][0] * (pos_of_e + 1);
        int ox = x + cordb[pos_of_d][1] * circuit + direc[pos_of_d][1] * (pos_of_e + 1);

        System.out.println(ox + " " + oy);
    }
}
//```