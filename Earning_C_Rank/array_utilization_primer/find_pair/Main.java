//言語：Java
//問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__find_pair
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n ;i++ )
        a[i]=sc.nextInt();
        
        Arrays.sort(a);
        int diff=1000;
        int ans=n;//該当なしだと配列の外を参照してエラー
         for (int i=0;i<n-1 ;i++ )
        {
            int sa=a[i+1]-a[i];//昇順に整列されているのでa[i+1]>=a[i]
            if(sa<diff)
            {
                diff=sa;
                ans=i;
            }
            
        }
        
        System.out.println(a[ans]);
        System.out.println(a[ans+1]);
                
    }
}




//```