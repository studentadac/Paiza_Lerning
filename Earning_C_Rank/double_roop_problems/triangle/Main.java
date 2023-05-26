//言語：Java
//問題URL：https://paiza.jp/works/mondai/double_roop_problems/double_roop_problems__triangle
//コメント：
// コード：
//```Java
import java.util.*;
/*整数 N が与えられるので、三角形の三辺の長さの和が N であり、全ての辺の長さが整数であるような直角三角形が存在するかどうかを判定してください。
なお、直角三角形の斜辺 a と他の二辺 b , c の間には次のような三平方の定理が成り立ちます。
*/


public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        boolean isTry=false;
        myLabel: for (int i=1;i<n ;i++ )
        {
            for (int j=1;  j<n-i;j++ )
            {
                int a=n-i-j;
                if(a*a==i*i+j*j&&a>=1)
                {
                    isTry=true;
                    break myLabel;
                }
            }
        }

        System.out.println( isTry?"YES":"NO"          );


    }
}
//```