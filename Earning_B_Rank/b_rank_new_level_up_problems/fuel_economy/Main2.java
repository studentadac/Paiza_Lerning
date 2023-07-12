//言語：Java
//問題URL：https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__fuel_economy
//コメント：条件分岐を削除したもの
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        long x=sc.nextLong();
        long f1=sc.nextLong();
        long f2=sc.nextLong();
        long L=sc.nextLong();
        int N=sc.nextInt();
        long[]s=new long[N+2];
        s[N+1]=L;
        
        for (int i=0;i<N ; i++)
            s[i+1]=sc.nextLong();
        
        long ans=0;
        for (int i=0;i<N+1 ; i++)
        {
            long section=s[i+1]-s[i];
            ans+= (Math.min(section,x)*f1+Math.max(0,section-x)*f2 );
        }

        System.out.println(ans);

    }
}
//```