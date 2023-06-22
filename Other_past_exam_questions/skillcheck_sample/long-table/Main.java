//言語：Java
//問題URL：https://paiza.jp/works/mondai/skillcheck_sample/long-table
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int ans=0;
        boolean[] table =new boolean[n];

        for (int i=0;i<m ;i++ )
        {
            int a=sc.nextInt();
            int b=sc.nextInt()-1;
            boolean brank=true;
            for (int j=0;j<a ;j++ )
            {
                if(table[(j+b)%n]  )
                {
                    brank=false;
                    break;
                }
            }

            if(brank)
            {
                ans+=a;
                for (int j=0;j<a ;j++ )
                {
                    table[(j+b)%n]=true;
                }
            }

        }
        //    for (int i=0;i<n ;i++ )
        //     System.out.println(table[i]);
        System.out.println(ans);
    }
}
//```