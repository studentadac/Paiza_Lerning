//言語：Java
//問題URL：https://paiza.jp/works/mondai/double_roop_problems/double_roop_problems__cuckoo_clock
//コメント：
// コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        final int h=24,m=60;

        for (int i=0;i<h ;i++ )
        {
            for (int j=0;j<m ;j++ )
            {
                final int t=i+j;
                if(t%3==0)
                    System.out.print("FIZZ");
                if(t%5==0)
                    System.out.print("BUZZ");

                System.out.println("");


            }


        }
    }
}
//```