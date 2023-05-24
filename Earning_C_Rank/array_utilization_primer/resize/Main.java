//言語：Java
//問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__resize
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N=sc.nextInt();
        int n=sc.nextInt();
        int[] a =new int [n];

        for (int i=0;i<n ;i++ )
            a[i]=0;
        
        int scLim=Math.min(N,n);
        
        for (int i=0;i<scLim ;i++ )
            a[i]=sc.nextInt();
            
        sc.close();

        for(var num:a)
        System.out.println(num);
    }
}
//```