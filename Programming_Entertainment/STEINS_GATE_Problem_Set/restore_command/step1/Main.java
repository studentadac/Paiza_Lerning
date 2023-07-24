//言語：Java
//問題URL：https://paiza.jp/works/mondai/steinsgate/restore_command_step1
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        var a=new int[2][n];
        
        for (int i=0;i<2 ;i++ )
        {
            for (int j=0;j<n ;j++ )
            a[i][j]=sc.nextInt();
        }
        
        for (int j=0;j<n ;j++ )
        System.out.print(a[1][j]-a[0][j] +  (j==n-1?"\n":" " )  );
        
        
    }
}
//```