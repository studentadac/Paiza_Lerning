//言語：Java
//問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__reduce
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int[] a =new int [n];

        for (int i=0;i<n ;i++ )
            a[i]=sc.nextInt();
        sc.close();

        for (int i=1;i<n ;i++ )
            for (int j=0;j<i ;j++ )
                System.out.println(a[i]*a[j]);
    }
}
//```