//言語：Java
//問題URL：https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__taxi_distance
//コメント：
//コード：
//```Java
import java.util.*;

public class Main {

    static int manCal(int p1, int p2) {
        return Math.abs(p1 - p2);
    }

    static int manCalx2(int x1, int x2, int y1, int y2) {
        return manCal(x1, x2) + manCal(y1, y2);
    }

    static double euCalx2(int x1, int x2, int y1, int y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pX = sc.nextInt();
        int pY = sc.nextInt();
        int n = sc.nextInt();

        List<int[]> matrix = new ArrayList<>();
        List<double[]> eu = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int number = i + 1;
            int manDis = manCalx2(x, pX, y, pY);
            double euDis = euCalx2(x, pX, y, pY);
            matrix.add(new int[]{manDis, number});
            eu.add(new double[]{euDis, number});
        }

        matrix.sort(Comparator.comparingInt((int[] arr) -> arr[0]).thenComparingInt(arr -> arr[1]));
        eu.sort(Comparator.comparingDouble((double[] arr) -> arr[0]).thenComparingDouble(arr -> arr[1]));

        for (int i = 0; i < 3; i++) {
            System.out.println((int) eu.get(i)[1]);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(matrix.get(i)[1]);
        }
    }
}

//```