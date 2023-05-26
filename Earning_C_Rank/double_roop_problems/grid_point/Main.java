//言語：Java
//問題URL：https://paiza.jp/works/mondai/double_roop_problems/double_roop_problems__grid_point
//コメント：
// コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        //     final int h=24,m=60;
        int max=0;

        for (int i=1;i<99 ;i++ )
        {
            for (int j=1;j<100-i ;j++ )
            {

                if((i*i*i+j*j*j)<100000)
                {
                    max=Math.max(max,i*j);
                }
            }
        }

        System.out.println(max);
    }
}
//```