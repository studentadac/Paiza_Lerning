//言語：java
//問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__sum
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        //   int[] a =new int [n];
        int sum=0;
        for (int i=0;i<n ;i++ )
            sum+=(sc.nextInt());
               

        System.out.println(sum);

    }
}
//```