//言語：Java
//問題URL：https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_sort_step2
//コメント：参考：https://flytech.work/blog/15029/
// コード：
//```Java
import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();


        Integer[] a=new Integer[n];

        for (int i=0;i<n ;i++ ){
            a[i]= sc.nextInt();
        }
                Arrays.sort(a,Collections.reverseOrder());

        for (int i=0;i<n ;i++ ){
            System.out.println(a[i]);
        }

    }
}
//````