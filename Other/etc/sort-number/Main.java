//言語：Java
//問題URL：https://paiza.jp/works/mondai/etc/sort-number
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
        int[] a=new int [n];
        for (int i=0;i<n ;i++ )
        {
            a[i]=sc.nextInt();
        }
        
        Arrays.sort(a);
         for (int i=0;i<n ;i++ )
        {
            System.out.println(a[i]);

        }
        
    }
}
//```