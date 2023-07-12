//言語：Java
//問題URL：https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__get_upsidedown
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {

    public static  char changeChar(char x) {
        char y = x == '#' ? '.' : '#';
        return y;
    }
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        var map=new char[h][w];


        for (int i=0;i<h ;i++ )
        {
            map[i]=sc.next().toCharArray();


        }
        int y=sc.nextInt();
        int x=sc.nextInt();

        map[y][x]=changeChar(map[y][x]);

        if(y!=0)
            map[y-1][x]=changeChar(map[y-1][x]);
        if(y!=h-1)
            map[y+1][x]=changeChar(map[y+1][x]);

        if(x!=0)
            map[y][x-1]=changeChar(map[y][x-1]);
        if(x!=w-1)
            map[y][x+1]=changeChar(map[y][x+1]);

        for (int i=0;i<h ;i++ )
        {
            System.out.println(map[i]);
        }
    }
}
//```