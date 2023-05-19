//言語：java
//問題URL：https://paiza.jp/works/mondai/loop_problems/loop_problems__seq_max

//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        final int n=sc.nextInt();

        int max_num=0;
        for (int i=0;i<n ;i++ )
        {
            int a=sc.nextInt();//入力値
            max_num= max_num>a?max_num:a;//入力値と現在の最大値の大きいほうを最大値に代入
        }
        sc.close();
        System.out.println(max_num);


    }
}
//```