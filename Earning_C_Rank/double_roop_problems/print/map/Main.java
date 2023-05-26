//言語：Java
//問題URL：https://paiza.jp/works/mondai/double_roop_problems/double_roop_problems__print_map
//コメント：メモリをあまり使わなそう
//小さいデータを小刻みにprint関数を呼び出して出力するのと 大きいデータにまとめて一度のprin文で出力するの、どっちがいいんだろう
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        
        for (int i=0;i<n ;i++ )
        {
           
           for (int j=0;j<k ;j++ )
           {
           System.out.print(sc.next());
           if(j!=k-1)
           System.out.print(" ");
           else
           System.out.println("");
               
           }
           
           
           
        }
           
    }
}
//```