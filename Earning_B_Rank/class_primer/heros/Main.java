//言語：Java
//問題URL：https://paiza.jp/works/mondai/class_primer/class_primer__heros
//コメント：
//コード：
//```Java
import java.util.*;

public class Main {
    static class Brave {
        int l;
        int h;
        int a;
        int d;
        int s;
        int c;
        int f;

        Brave(int l, int h, int a, int d, int s, int c, int f) {
            this.l = l;
            this.h = h;
            this.a = a;
            this.d = d;
            this.s = s;
            this.c = c;
            this.f = f;
        }

        void levelUp(int h, int a, int d, int s, int c, int f) {
            this.l += 1;
            this.h += h;
            this.a += a;
            this.d += d;
            this.s += s;
            this.c += c;
            this.f += f;
        }

        void muscleTraining(int h, int a) {
            this.h += h;
            this.a += a;
        }

        void running(int d, int s) {
            this.d += d;
            this.s += s;
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
        int n = sc.nextInt();
        int k = sc.nextInt();

        var Braves = new ArrayList<Brave>(n);

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int h = sc.nextInt();
            int a = sc.nextInt();
            int d = sc.nextInt();
            int s = sc.nextInt();
            int c = sc.nextInt();
            int f = sc.nextInt();

            Braves.add(new Brave(l, h, a, d, s, c, f));
        }

        for (int i = 0; i < k; i++) {
            var toI = sc.nextInt() - 1;
            var BravetoI = Braves.get(toI);
            var event = sc.next().toCharArray()[0];

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
        for (var brave: Braves )
        {
            
            System.out.println(  brave.l+" "+brave.h+" "+ brave.a+" "+brave.d+" "+ brave.s+" "+brave.c+" "+brave.f );
            
        }
        
        
    }
}
//```