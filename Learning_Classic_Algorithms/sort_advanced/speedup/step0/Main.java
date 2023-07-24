//言語：Java
//問題URL：https://paiza.jp/works/mondai/sort_advanced/sort_advanced__problems_speedup_step0
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        var a=new int[n];
      
        for (int i=0;i<n ;i++ )
            a[i]=(sc.nextInt());

        Arrays.sort(a);
        //   System.out.println();
        for (int i=0;i<q ;i++ )
        { 
            int k=sc.nextInt();
            System.out.println(a[n-k]);
        }
    }
}
//```