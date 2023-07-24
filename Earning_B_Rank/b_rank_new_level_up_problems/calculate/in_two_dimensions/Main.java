//言語：Java
//問題URL：https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__calculate_in_two_dimensions
//コメント：N要素からなる、だからＮ要素未満を含め斜めを全て網羅する必要はなかった、というかしてはいけなかった、テストケースが厳しかったら不合格になっているコード 参考 https://qiita.com/Naoya_pro/items/4443039650bdc20fa680
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        var a=new int[n][n];
        
        for (int i=0;i<n ;i++ ) 
        for (int j=0;j<n ;j++ )
        a[i][j]=sc.nextInt();
        
        int max=0;
        for (int i=0;i<n ;i++ ) 
        {
        int tate=0;
        int yoko=0;
            
        for (int j=0;j<n ;j++ )
        {
         tate+=a[i][j];
         yoko+=a[j][i];
            
        }
        max=Math.max(max,Math.max(tate,yoko));
        }
        
        for (int d=1-n;d<n ;d++ )
        {
            int hidarinaname=0;
            int miginaname=0;//
            final int absD=Math.abs(d);
            for(int i=0;i<n- absD;i++)
            {
                
                hidarinaname+=a[Math.max(0,-d)+i][Math.max(0,d)+i];
                miginaname+=a[Math.max(0,d)+i][Math.min(n+d,n)-i-1];
                
            }
            max=Math.max(max,Math.max(hidarinaname,miginaname));
        }
        
        System.out.println(max);
    }
}
//```