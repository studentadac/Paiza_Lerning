//言語：java
//問題URL：https://paiza.jp/works/mondai/loop_problems/loop_problems__seq_min

//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        final int n=sc.nextInt();

        int min_num=100;
        for (int i=0;i<n ;i++ )
        {
            int a=sc.nextInt();//入力値
            min_num= min_num<a?min_num:a;//入力値と現在の最小小値の小さい数値を最小値に代入
        }
        sc.close();
        System.out.println(min_num);


    }
}
//```