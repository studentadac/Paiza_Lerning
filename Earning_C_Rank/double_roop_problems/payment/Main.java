//言語：Java
//問題URL：https://paiza.jp/works/mondai/double_roop_problems/double_roop_problems__payment
//コメント：pythonの模範解答に近い解法
// コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int ans=z;

        for (int i=0;i<= (int)z/x  ;i++     )
        {
            for(int j=0;j<=(int) z/y ;j++)
            {
                int iciYen=(z-((i*x)+(j*y)));
                if (iciYen>=0)
                    ans=Math.min(   ans,  i+j+iciYen    ) ;
            }
        }
        System.out.println(ans);

    }
}
//```