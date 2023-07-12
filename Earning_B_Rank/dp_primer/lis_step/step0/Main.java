//言語：Java
//問題URL：https://paiza.jp/works/mondai/dp_primer/dp_primer_lis_step0
//コメント：解く前に  https://atcoder.jp/contests/abc124/tasks/abc124_b をやると理解しやすいかも
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var n=sc.nextInt();
        var a=new int[n];
        
        for (int i=0;i<n ;i++ )
        a[i]=sc.nextInt();
        
        var dp=new int[n];
        dp[0]=1;
        for (int i=1;i<n ;i++ )
        {
            dp[i]=1;
            for (int j=0;j<i ;j++ )
            {
                if(a[j]<a[i])
                dp[i]=Math.max(dp[i],dp[j]+1);
                
            }
            
        }
        var max=0l;
        for (int i=0;i<n ;i++ )
        {
        if(max<dp[i])
        max=dp[i];
        }
        
        System.out.println(max);
        
        
        /*
        dp[1] <- 1

for i = 2 to n
    dp[i] <- 1  // 木 i のみからなる部分列の長さ
    for j = 1 to i-1
        if a[j] < a[i] then
            dp[i] <- max(dp[i], dp[j]+1)    // 最後が木 j であるような増加部分列の末尾に木 i をくっつける

print max({dp[1], ... ,dp[n]})
        */
    
    
    }
}
//```