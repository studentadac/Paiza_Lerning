//言語：Java
//問題URL：https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__similar_randamize
//コメント：とりあえず全部型の範囲より小さい値を必ず取る剰余にしておけば、桁あふれはおこらない
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        
        long x=sc.nextLong();
        long m=sc.nextLong();
        int n=sc.nextInt();
        var a=new ArrayList<Long>(n+1);//累積和
        var s=new ArrayList<Long>(n+2);//累乗
        a.add(1L);
        s.add(0L);
        for (int i=0;i<n ;i++ )
        {
            long pow=(a.get(i)*x)%m;
            long total=(pow+s.get(i))%m;
            long ans= total%m;
            System.out.println(ans);
            a.add(pow%m);
            
            s.add((s.get(i)+pow)%m );
            
            
        }
        
       // System.out.println(a.size());
        
    }
}

//```