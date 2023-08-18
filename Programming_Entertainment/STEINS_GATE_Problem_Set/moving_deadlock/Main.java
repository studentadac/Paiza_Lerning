//言語：Java
//問題URL：https://paiza.jp/works/mondai/steinsgate/moving_deadlock_step1
//コメント：変数名適当につけたのでこんがらがった
//コード：
//```Java

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);

        final var n=sc.nextInt();
        final var m=sc.nextInt();
        final var q=sc.nextInt();
        var b=new int[n+1];
        var c=new int[n+1];
        for (int i=1;i<=m ;i++ )
        {
            int s=sc.nextInt();
            // System.out.println(s);
            b[s]=i;
            c[i]=s;
        }

        for (int i=0;i<q ;i++ )
        {
            int e=sc.nextInt();
            int t=sc.nextInt();
            if(b[c[e]]>0&&b[t]==0||c[e]==t)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}


//```