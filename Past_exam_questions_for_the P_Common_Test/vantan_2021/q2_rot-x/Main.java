//言語：Java
//問題URL：https://paiza.jp/works/mondai/vantan_2021/vantan_2021__q2_rot-x
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
        var s=sc.next().toCharArray();
        var t=sc.next().toCharArray();

        int minMiss=n;
        int ans=0;

        for (int i=0;i<=25 ;i++ )
        {
            var c=new char[n];
            int cnt=0;

            for(int j=0;  j<n  ;j++ )
            {

                int num=(int)s[j]-'a';
                num=(num+i)%26;

                c[j]=(char)(num+'a');

                if(c[j]!=t[j])
                {

                    cnt++;
                }


            }
            minMiss=Math.min(minMiss,cnt);


            if(minMiss==0)
            {
                System.out.println("correct rot-"+i);
                return;
            }
            else if(minMiss==1)
            {
                System.out.println("fixed "+String.valueOf(c));
                return;
            }
        }
        System.out.println("incorrect");
    }
}
//```