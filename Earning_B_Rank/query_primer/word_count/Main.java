//言語：Java
//問題URL：https://paiza.jp/works/mondai/query_primer/query_primer__word_count
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
        int k=sc.nextInt();
        var a=new int[n];
        var s=new long[n+1];
        for (int i=0;i<n ;i++ )
        {
            a[i]=sc.nextInt();
            s[i+1]=s[i]+a[i];
        }

        int over = n/3  ;
        if(n%3!=0)
            over++;
        //   System.out.println(over);
        for (int i=0;i<k ;i++ )
        {
            int al=sc.nextInt();
            int ar=sc.nextInt();

            int bl=sc.nextInt();
            int br=sc.nextInt();

            if(ar-al+1>=over ||br-bl+1>=over   )
            {
                if(ar-al+1>=over&&br-bl+1>=over )
                    System.out.println("DRAW");
                else  if(ar-al>br-bl)
                {
                    System.out.println("B");
                }
                else
                    System.out.println("A");
            }
            else
            {
                long A=s[ar]-s[al-1];
                long B=s[br]-s[bl-1];

                //   System.out.println(A+" "+B);
                if(A==B)
                    System.out.println("DRAW");
                else if(A>B)
                    System.out.println("A");
                else
                    System.out.println("B");
                //       System.out.println(A>B?"A":A==B?"DRAW":"B");
            }
        }
        
    }
}
//```