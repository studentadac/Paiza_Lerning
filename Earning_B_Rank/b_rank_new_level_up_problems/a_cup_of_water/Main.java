//言語：Java
//問題URL：https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__a_cup_of_water
//コメント：どうしてもわからなかったから解いた方のコードをChatGPTでJavaに変換させたもの
//コード：
//```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] cups = new int[N];
        for (int i = 0; i < N; i++) {
            cups[i] = sc.nextInt();
        }
        
        boolean[] water = new boolean[X + 1];
        water[0] = true;
        
        for (int cup : cups) {
            for (int i = X; i >= cup; i--) {
                if (water[i - cup]) {
                    water[i] = true;
                }
            }
        }
        
        int maxWater = 0;
        for (int i = X; i >= 0; i--) {
            if (water[i]) {
                maxWater = i;
                break;
            }
        }
        
        System.out.println(maxWater);
    }
}

//```