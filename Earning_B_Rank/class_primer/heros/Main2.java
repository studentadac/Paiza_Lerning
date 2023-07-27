//言語：Java
//問題URL：https://paiza.jp/works/mondai/class_primer/class_primer__heros
//コメント：CharGPTによる文字数省略
//コード：
//```Java
import java.util.*;

public class Main {
    static class Brave {
        int l, h, a, d, s, c, f;

        Brave(int l, int h, int a, int d, int s, int c, int f) {
            this.l = l; this.h = h; this.a = a; this.d = d; this.s = s; this.c = c; this.f = f;
        }

        void levelUp(int h, int a, int d, int s, int c, int f) {
            this.l++; this.h += h; this.a += a; this.d += d; this.s += s; this.c += c; this.f += f;
        }

        void muscleTraining(int h, int a) {
            this.h += h; this.a += a;
        }

        void running(int d, int s) {
            this.d += d; this.s += s;
        }

        void study(int c) {
            this.c += c;
        }

        void pray(int f) {
            this.f += f;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        var Braves = new ArrayList<Brave>(n);

        while (n-- > 0) {
            Braves.add(new Brave(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
                                sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }

        while (k-- > 0) {
            var toI = sc.nextInt() - 1;
            var BravetoI = Braves.get(toI);
            var event = sc.next().charAt(0);

            switch (event) {
                case 'l' -> BravetoI.levelUp(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
                case 'm' -> BravetoI.muscleTraining(sc.nextInt(), sc.nextInt());
                case 'r' -> BravetoI.running(sc.nextInt(), sc.nextInt());
                case 's' -> BravetoI.study(sc.nextInt());
                case 'p' -> BravetoI.pray(sc.nextInt());
                default -> System.out.println("miss");
            }
        }

        sc.close();
        Braves.forEach(brave -> System.out.println(brave.l + " " + brave.h + " " + brave.a + " " +
                                                  brave.d + " " + brave.s + " " + brave.c + " " + brave.f));
    }
}

//```