//言語：Java
//問題URL：https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__loop_boss
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        for (int i=1;i<=100 ;i++ )
        {
            if(i%3!=0&&i%5!=0)
                System.out.print(i);
            else{
                if(i%3==0)
                    System.out.print("Fizz");
                if(i%5==0)
                    System.out.print("Buzz");
            }
            System.out.println();
        }
    }
}
//```