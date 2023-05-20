//言語：Java
//問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__string_boss
//コメント：最小値の表示は最大値のそれと同じコードなのでカット
//コード：
//```java
/*縦 H マス、横 W マスの H × W マスからなる迷路 S があります。
上から i 行目、左から j 列目のマス は S_ij とあらわされ、 S_ij が「#」のとき壁であり、「.」のとき道です。
整数 r、c が与えられるので、S_rc が壁かどうか判定してください。
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(),w=sc.nextInt(),r = sc.nextInt()-1,c=sc.nextInt()-1;
        char[][] map=new char[h][w];

        for (int i=0;i<h ;i++ )
        { String s=sc.next();//javaにnextCharはないので文字列から文字を取り出す
            for (int j=0;j<w ;j++ )
                map[i][j]=s.charAt(j);
        }

        if (map[r][c]=='#')
            System.out.println("Yes");

        else
            System.out.println("No");


    }
}
//```