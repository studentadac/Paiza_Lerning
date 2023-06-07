//言語：Java
//問題URL：https://paiza.jp/works/mondai/sequence_search_problems/sequence_search_problems_minmax_boss
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
        a[i]=sc.nextInt();
       
       Arrays.sort(a);
        System.out.println(a[n-1]+" "+a[0]);
    }
}
//```