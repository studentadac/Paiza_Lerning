//言語：Java
//問題URL：https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_sort_step3
//コメント：参考：https://teratail.com/questions/285827
//Dランクとあるけど、個人的に難しかったし正答率も低いのでBよりのCランク問題といった難易度では?と思った
// コード：
//```Java
import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();
        // sc.nextLine();
        String[][] a=new String[n][2];
        String[] s=new String[n];
        
        for (int i=0;i<n ;i++ ){

            s[i]="";
            for (int j=0;j<2 ;j++ )
            {

                a[i][j]=sc.next();//バナナとリンゴの数を格納
                s[i]+="0".repeat(2-a[i][j].length())+a[i][j]+" ";//一桁の果物は冒頭にゼロをつける。
//バナナとリンゴを空白で分けて合成した文字列を作る
            }




        }
        Arrays.sort(s,Collections.reverseOrder());//降順にソート

        String[][] ans =new String [n][2];//

        for (int j=0;j<n ;j++ )
        {

            ans[j]=s[j].split(" ");//半角で文字列を分割
        }
        
        for (int i=0;i<n ;i++ ){
            System.out.println(Integer.parseInt(ans[i][0])+" "+Integer.parseInt(ans[i][1]));//整数に型変換して出力させるとゼロは自動的に消える
        }
    }
}
//````