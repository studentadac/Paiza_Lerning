//言語：Java
//問題URL：https://paiza.jp/works/mondai/a_rank_level_up_problems/a_rank_snake_move_step1
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        var h=Integer.parseInt(s[0]);
        var w=Integer.parseInt(s[1]);
        var map=new char[h][w];
        //   System.out.print(sc.next());
        for (int i=0;i<h ;i++ )
        {
            map[i]=sc.next().toCharArray();
        }
        

        for (int i=0;i<h ;i++ )
        {
            for (int j=0;j<w ;j++ )
            {
                 
                if ( map[i][j]=='#'   ) 
                {
                    System.out.println(i+" "+j);
                    return;
                }
            }
        }
    }
}
//```