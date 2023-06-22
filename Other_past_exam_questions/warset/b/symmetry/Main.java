//言語：Java
//問題URL：https://paiza.jp/works/mondai/warset/b1_symmetry
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

        var map=new char[h][w];
        for (int i=0;i<h ;i++ )
            map[i]=sc.next().toCharArray();




        boolean wides=true;
        m: for (int i=0;i<h ;i++ )
            for (int j=0;j<w ;j++ )
            {
                if(map[i][j]!=map[i][w-j-1])
                {
                    wides=false;
                    break m;
                }

            }
        boolean highs=true;
        m: for (int i=0;i<h ;i++ )
            for (int j=0;j<w ;j++ )
            {
                if(map[i][j]!=map[h-i-1][j])
                {
                    highs=false;
                    break m;
                }

            }
        boolean ls=highs||wides;

        boolean ps=true;

        m: for (int i=0;i<h ;i++ )
            for (int j=0;j<w ;j++ )
            {
                if(map[i][j]!=map[h-i-1][w-j-1])
                {
                    ps=false;
                    break m;
                }

            }
         
         /*・線対称であるとき、line symmetry
・点対称であるとき、point symmetry
・線対称かつ点対称であるとき、line point symmetry
・線対称でも点対称でもないとき、none*/
        String ans;
        if(ps||ls)
        {
            ans="symmetry";

            if(ps)
                ans="point "+ans;
            if(ls)
                ans="line " +ans;


        }
        else
            ans="none";


        System.out.println(ans);



    }
}
//```