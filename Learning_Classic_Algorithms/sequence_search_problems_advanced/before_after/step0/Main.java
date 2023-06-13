//言語：Java
//問題URL：https://paiza.jp/works/mondai/sequence_search_problems_advanced/sequence_search_problems_advanced__before_after_step0
//コメント：独創性を発揮しにくい問題なので模範解答とほぼ同じ 
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        
        int[] a =new int[n];
         for (int i=0;i<n ;i++ )
        a[i]=sc.nextInt();
        
        int ans=0;
        for (int i=0;i<n-1 ;i++ )
        if(a[i]==a[i+1])
        ans++;
        
        System.out.println(ans);
        
    }
}
//```