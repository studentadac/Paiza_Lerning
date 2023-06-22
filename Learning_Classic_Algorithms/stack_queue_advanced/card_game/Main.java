//言語：Java
//問題URL：https://paiza.jp/works/mondai/stack_queue_advanced/stack_queue_advanced__card_game
//コメント： 
//コード：
//```Java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        var deck = new ArrayDeque<Boolean>();
        var grave = new ArrayDeque<Boolean>();
        var exclude = new ArrayDeque<Boolean>();
        int cards = 40;
        for (int i = 1; i <=cards ; i++) {
            deck.add(i == n);
        }
        Boolean win = false;

        for (int i = 0; i < k; i++) {
            String s = sc.next();
            int num = 5;
            if (i > 0) {
                num = sc.nextInt();
            }

            switch (s) {
                case "game_start", "draw" -> {
                    for (int j = 0; j < num; j++) {
                        win = deck.poll();
                        if (win) {
                            System.out.println(i + 1);
                            return;
                        }
                    }
                }
                case "discard" -> {
                    for (int j = 0; j < num; j++) {
                        grave.push(deck.poll());
                    }
                }
                case "exclude" -> {
                    for (int j = 0; j < num; j++) {
                        exclude.push(deck.poll());
                    }
                }
                case "return_from_the_graveyard" -> {
                    for (int j = 0; j < num; j++) {
                        deck.add(grave.pop());
                    }
                }
                case "return_from_the_exclusion" -> {
                    for (int j = 0; j < num; j++) {
                        deck.add(exclude.pop());
                    }
                }
            }
       
        }

        System.out.println("Lose");
    }
}
//```