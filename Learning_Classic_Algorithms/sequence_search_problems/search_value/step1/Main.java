//言語：Java
//問題URL：https://paiza.jp/works/mondai/sequence_search_problems/sequence_search_problems_search_value_step1
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
            if( a[i]==k )
            {
                ans=i+1;
                break;
            }
        }

        System.out.println(ans);
    }
}
//```