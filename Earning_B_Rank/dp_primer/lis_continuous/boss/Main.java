//言語：Java
//問題URL：https://paiza.jp/works/mondai/dp_primer/dp_primer_lis_continuous_boss
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        var n = sc.nextInt();
        int[] a=new int[n];

        for (int i=0;i<n ;i++ )
            a[i] = sc.nextInt();

       
        int[]dp= new int[n];
        dp[0]=1;

        for (int i=1;i<n ;i++ )
        { 
            if (a[i-1] >= a[i])
            dp[i]=dp[i-1]+1;
        else{
           
            dp[i]=1;
        }
        }

      
        System.out.println(Arrays.stream(dp).max().getAsInt());

    }
}
//```