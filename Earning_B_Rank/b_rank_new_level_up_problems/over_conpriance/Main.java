//言語：Java
//問題URL：https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__over_conpriance
//コメント：攻めてる問題文
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int sL=s.length();
        String fS=s.substring(0,sL/2+ sL%2 );
        //   System.out.println(fS);
        String sS=s.substring(sL/2);
        //  System.out.println(sS);
        var V=new String[n];
        for (int i=0;i<n ;i++ )
            V[i]=sc.next();

        for (int i=0;i<n ;i++ )
        {
            String v=V[i];
            String ans;
            if(sL==v.length())
            {
                if(v.equals(s))
                    ans="banned";
                else
                {
                    String fV=v.substring(0,sL/2+ sL%2 );
                    // System.out.println(fS);
                    String sV=v.substring(sL/2);
                    //   System.out.println(sS);
                    if(fV.equals(fS))
                        ans="x".repeat(sL/2+ sL%2)+v.substring(sL/2+ sL%2);
                    else if(sV.equals(sS))
                        ans= v.substring(0,sL-(sL/2+sL%2) ) +"x".repeat(sL/2+sL%2);
                    else
                        ans=v;
                }
            }
            else
                ans=v;
            System.out.println(ans);
        }
    }
}
//```