//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems_advanced/prefix_sum_problems_advanced__imos_practice_step2
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);

        var n=sc.nextInt();
        var m=sc.nextInt();
        final int t=1000;
        var a=new int[t+1];

        for (var i=0;i<n ;i++ )
        {
            var l=sc.nextInt()-1;
            var r=sc.nextInt();
            var p=sc.nextInt();
            //      System.out.println(l+" "+r);
            a[l]+=p;
            a[r]-=p;
        }
        //疎
        boolean so=true;
        var s=new int[t+2];
        for (var i=0;i<t+1 ;i++ )
        {
            s[i+1]=(a[i]+s[i]);
            if(s[i+1]>=m)
            {
                so=false;
                break;
            }
        }
        System.out.println(so?"Yes":"No");
    }
}
//```