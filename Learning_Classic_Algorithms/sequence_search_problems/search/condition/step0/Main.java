//言語：Java
//問題URL：https://paiza.jp/works/mondai/sequence_search_problems/sequence_search_problems_search_condition_step0
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        final int n=sc.nextInt();
        int[] a =new int[n];
        for (int i=0;i<n ;i++ )
        {
            a[i]=sc.nextInt();
       if(a[i]%2==0)
        {
            System.out.println(i+1);
            break;
        }
        }
    }
}
//```