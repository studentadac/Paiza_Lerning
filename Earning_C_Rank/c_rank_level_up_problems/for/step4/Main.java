//言語：Java
//問題URL：https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_for_step4
//コメント：
// コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);

        var m = sc.nextInt();
        String[] a =new String[m];
        for (int i=0;i<m ;i++ ){
            a[i]=sc.next();
        }

        var n = sc.nextInt();
        String[]b=new String[n];
        for (int i=0;i<n ;i++ ){

            b[i]=sc.next();
        }

        for (int i=0;i<m ;i++ ){
            for (int j=0;j<n ;j++ )
                System.out.println(b[j].indexOf(a[i])!=-1?"YES":"NO");
        }
    }
}

//````