//言語：Java
//問題URL：https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_sort_step1
//コメント：
// コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();


        int[] a=new int[n];

        for (int i=0;i<n ;i++ ){
            a[i]= sc.nextInt();
        }
        Arrays.sort(a);
        for (int i=0;i<n ;i++ ){
            System.out.println(a[i]);
        }

    }
}
//````