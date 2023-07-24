//言語：Java
//問題URL：https://paiza.jp/works/mondai/a_rank_level_up_problems/a_rank_pincerattack_step2
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();

        int y=sc.nextInt();
        int x=sc.nextInt();

        var map=new char[h][w];

        for (int i=0;i<h ;i++ )
            map[i]=sc.next().toCharArray();

        map[y][x]='*';

        int i=0,j=0;
        for (i=x+1;i<w ;i++ )
        {
            if(map[y][i]=='*')
            {
                for (j=x+1;j<i ;j++ )
                    map[y][j]='*';
                break;
            }


        }

        map[y][x]='*';
        for (i=x-1;i>=0 ;i-- )
        {
            if(map[y][i]=='*');
            {

                // System.out.println("find");
                for (j=i;j<x ;j++ )
                {
                    map[y][j]='*';
                }
                break;
            }
        }

        for (i=y+1;i<h ;i++ )
        {
            if(map[i][x]=='*')
            {
                for (j=y+1;j<i ;j++ )
                    map[j][x]='*';
                break;
            }
        }
        for (i=x-1;i>=0 ;i-- )
        {
            if(map[i][x]=='*')
            {
                for (j=i;j<y ;j++ )
                    map[j][x]='*';
                break;
            }
        }
        for ( i=0;i<h ;i++ )
            System.out.println(String.valueOf(map[i]));
    }
}
//```