//言語：Java
//問題URL：https://paiza.jp/works/mondai/sequence_search_problems_advanced/sequence_search_problems_advanced__before_after_step2
//コメント：独創性を発揮しにくい問題なので模範解答とほぼ同じ 
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();


        int[] a =new int[n];
        for (int i=0;i<n ;i++ )
            a[i]=sc.nextInt();

        int ans=0,max=-k*100;//-100がk回続くのが最低の最大値
        myLabel: for (int i=0;i<n ;i++ )
        {
            int addThreenum=0;

            for (int j=i;j<i+k ;j++ )
            {
                if(j>=n)
                {
                    // addThreenum=max;
                    break myLabel;//連続してk個足せなくなったら二重ループをbreak
                }
                addThreenum+=a[j];
            }
            //System.out.println(addThreenum);
            if(addThreenum>max)
            {
                ans=i+1;
                max=addThreenum;
            }
        }
        System.out.println(ans);
    }
}
//```