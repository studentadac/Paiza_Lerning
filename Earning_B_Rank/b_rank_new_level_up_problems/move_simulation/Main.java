//言語：Java
//問題URL：https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__move_simulation
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
        var x=new long[n];
        var y=new long[n];
        var t=new int[n];
        for (int i=0;i<n ;i++ )
        {
            t[i]=sc.nextInt();
            y[i]=sc.nextLong();
            x[i]=sc.nextLong();
        //    System.out.println(y[i]);
        //    System.out.println(x[i]);
        }
        int lim=101;
        
        var ansX=new long[lim];
        var ansY=new long[lim];
        int cnt=0;
        
        for (int i=0;i<lim ;i++ )
        {
            
            if(i==t[cnt])
            {
           //     System.out.println(i);
                ansX[i]=x[cnt];
                ansY[i]=y[cnt];
          //      System.out.println(ansY[i]);
                cnt++;
            }
            else
            {
             //   System.out.println((x[cnt] - x[cnt - 1]) / (t[cnt] - t[cnt - 1]) );
             //切片は最後に一致した座標
             //傾きは距離割る時間
             //時間は最後の実測値と時刻Tの差
               ansX[i] = x[cnt-1]+(( i-t[cnt-1])*(x[cnt] - x[cnt - 1])) / (t[cnt] - t[cnt - 1]) ;
               ansY[i] = y[cnt-1]+(( i-t[cnt-1])*(y[cnt] - y[cnt - 1])) / (t[cnt] - t[cnt - 1]) ;
            }
        }
        
        
        for (int i=0;i<lim ;i++ )
        System.out.println(ansY[i]+" "+ansX[i]);
        
        
    }
}



//```