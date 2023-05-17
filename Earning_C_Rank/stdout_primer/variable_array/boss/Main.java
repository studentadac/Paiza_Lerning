//言語：java
//問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__variable_array_boss
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        final int n=sc.nextInt();
        final int m=sc.nextInt();

        int[] a=new int[n];
      

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();

        }

        int[] b=new int[m];
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        
        int cnt=0;//現在の数字の位置
        for (int i=0;i<m ;i++ )
        {

            for(  int j=0  ;  j<b[i]  ;j++    )
            {
                System.out.print(a[j+cnt]);

                if(j!=b[i]-1)
                    System.out.print(" ");
                else
                    System.out.println("");
            }
            cnt+=b[i];//位置を更新

        }
        
    }
}
//```