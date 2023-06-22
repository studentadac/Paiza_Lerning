//言語：Java
//問題URL：https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__get_one
//コメント： 
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h,w,x,y;
        h=sc.nextInt();
        w=sc.nextInt();
        char[][] line=new char[h][w];
        for (int i=0;i<h ;i++ )
        {
            line[i] = sc.next().toCharArray();


        }
        y=sc.nextInt();
        x=sc.nextInt();

        line[y][x]=line[y][x]=='#'?'.':'#';

        for (int i=0;i<h ;i++ )
        {
            System.out.println(line[i]);
        }
    }
}
//```