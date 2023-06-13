//言語：Java
//問題URL：https://paiza.jp/works/mondai/sequence_search_problems_advanced/sequence_search_problems_advanced__range_boss
//コメント：  自力ではわからなかったので模範解答少しアレンジして解いたんですけど、cppの模範解答間違っています
//       誤 for (int i = l + 1; i + 1 < r; i++) 正             for (int i = l + 1; i + 1 <= r; i++)
// l + 1 ≦ i ≦ r - 1 を満たすすべての i  
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();


        int []a=new int[n];
        for (int i=0;i<n ;i++ )
            a[i]=sc.nextInt();


        int ans=0;
        for (int l = 0; l < n; l++) {
            for (int r = l + 2; r < n; r++) {
                boolean is_zigzag = true;

                for (int i = l + 1; i + 1 <= r; i++) {
                    if (!((a[i - 1] < a[i] && a[i] > a[i + 1]) ||
                            (a[i - 1] > a[i] && a[i] < a[i + 1])))
                    {
                        is_zigzag = false;
                        break;
                    }


                }

                if (is_zigzag) {
                    ans++;
                }


            }

        }
        System.out.println(ans);



    }
}
//```