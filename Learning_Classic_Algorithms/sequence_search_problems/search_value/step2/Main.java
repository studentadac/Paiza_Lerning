//言語：Java
//問題URL：https://paiza.jp/works/mondai/sequence_search_problems/sequence_search_problems_search_value_step2
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n ;i++ )
        {
            a[i]=sc.nextInt();
        }

        int k=sc.nextInt(),ans=0;

        for (int i=0;i<n ;i++ )
        {
            if( a[n-i-1]==k )
            {
                ans=n-i;
                break;
            }
        }

        System.out.println(ans);
    }
}
//```