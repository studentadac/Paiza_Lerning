//言語：Java
//問題URL：https://paiza.jp/works/mondai/forest_contest_008/forest_contest_008__OPS2
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
        double max=0;
        var sum=new double[n];
        for (int i=0;i<n ;i++ )
        {
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        sum[i]=a+b;
        max=Math.max(max,sum[i]);
        }
        
        for (int i=0;i<n ;i++ )
        {
        
        if(sum[i]==max)
        {
            System.out.println(i+1);
            return;
        }
        }
        
    }
}
//```