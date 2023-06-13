//言語：Java
//問題URL：https://paiza.jp/works/mondai/dp_primer/dp_primer_lis_continuous_step0
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

        int max=0;
        int dp=1;

        for (int i=1;i<n ;i++ )
        { 
            if (a[i-1] <= a[i])
            dp++;
        else{
            max=Math.max(max,dp);
            dp=1;
        }
        }

        max=Math.max(max,dp);//最後の増分はループ内では比較できない

        System.out.println(max);
    }
}
//```