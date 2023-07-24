//言語：Java
//問題URL：https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__leet_paiza
//コメント：ChatGPTを下地に正規表現を自力で微修正
//コード：
//```Java
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();

        Pattern pattern = Pattern.compile("(p[a@4][i1!][z2][a@4])");
        Matcher matcher = pattern.matcher(S);

        if (matcher.find()) {
            String match = matcher.group();
            if (match.equals("paiza")) {
                System.out.println("paiza");
            } else {
                System.out.println("leet");
            }
        } else {
            System.out.println("nothing");
        }
    }
}
//```