//言語：Java
//問題URL：https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__perfect_shuffle
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        final int n=52;//カードの枚数
        String[] deck=new String[n];
        //   Arrays.fill(deck,"_");
        String[] kinds={"S","H","D","C"};
        int x=0;
        for (int i=0;i<n ;i++ )
        {
            deck[i]=kinds[x]+"_"+Integer.toString(i%13+1);
            if(i>0&&i%13+1==13 )
                x++;
            //       System.out.println(deck[i]);
        }
        String[] ans=new String[n];
        //   if(k>0)
        for (int i=0;i<k ;i++ )
        {
            int cnt=1;
            for (int j=0;j<n ;j++ )
            {
                // System.out.println(j%2==0?n-cnt:(n/2)-cnt++);
                ans[n-j-1]=  j%2==0?deck[n-cnt]:deck[(n/2)-cnt++];
            }
            deck=Arrays.copyOf(ans, n);
        }
        //   Collections.reverse(Arrays.asList(deck));
        for (int i=0;i<n ;i++ )
        {
            System.out.println(deck[i]);
        }
    }
}
//```