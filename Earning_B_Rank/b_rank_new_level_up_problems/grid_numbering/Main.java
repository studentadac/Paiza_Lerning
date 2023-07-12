//言語：Java
//問題URL：https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__grid_numbering
//コメント：斜め走査は壁に沿っていくイメージ
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h,w;
        h=sc.nextInt();
        w=sc.nextInt();
        int[][] a=new int[h][w];

        int d=sc.nextInt();
        int cnt=1;

        switch (d) {

            case 1->
            {

                int x=0,y=0;
                int startX=0,startY=0;

                while(cnt<=h*w)
                {


                    a[y--][x++]=cnt++;
                    // System.out.println(y+++" "+x--+" "+(cnt++));
                    // y--;x++;   cnt++;
                    if(y<0||x>=w)
                    {
                        if(startY!=h-1)
                            startY++;
                        else
                            startX++;
                        
                        y=startY;
                        x=startX;
                    }
                }
            }

            case 2 ->

            {

                for (int i=0;i<h ;i++ )
                {
                    for (int j=0;j<w ;j++ )
                        a[i][j]=cnt++;

                }

            }

            case 3 ->
            {
                for (int i=0;i<w ;i++ )
                {
                    for (int j=0;j<h ;j++ )
                        a[j][i]=cnt++;
                }
            }

            case 4->

            {
                int x=0,y=0;
                int startX=0,startY=0;

                while(cnt<=h*w)
                {
                    a[y++][x--]=cnt++;
                    //    System.out.println(y+" "+x+" "+(cnt));
                    // y--;x++;   cnt++;
                    if(y>=h||x<0)
                    {

                        if(startX!=w-1)
                            startX++;
                        else
                            startY++;
                        y=startY;
                        x=startX;
                    }
                }
            }
        }

        for (int i=0;i<h ;i++ )
        {
            for (int j=0;j<w ;j++ )
            {
                System.out.print(a[i][j]);
                if(j<w-1)
                    System.out.print(" ");
            }

            System.out.println();

        }

    }
}
//```