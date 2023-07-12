//言語：Java
//問題URL：https://paiza.jp/works/mondai/prefix_sum_problems_advanced/prefix_sum_problems_advanced__prefix_practice_step1
//コメント：解いた後で気づいたが、最大値がマイナスになる場合もあるので、ansはもっと低くとったほうがいい
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        var ar=new int[n];
        var s=new long[n+1];
        for (int i=0;i<n ;i++ )
        {
            ar[i]=sc.nextInt();
        }
        
        for (int i=0;i<n ;i++ )
        {
            s[i+1]=s[i]+ar[i];
        }
        var s2=new long[n+1];
        long ans=0;
        
        for (int i=0;i<n ;i++ )
        {
            s2[i+1]=s[i+1]+s2[i];
            if(ans<s2[i+1])
            ans=s2[i+1];
            
        }
        System.out.println(ans);
        
        

       

        
    }
}
//```