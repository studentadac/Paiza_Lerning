//言語：java
//問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__kind
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        
        var set =new HashSet<Integer>();
        //   int[] a =new int [n];
     //   int k=sc.nextInt();
        for (int i=0;i<n ;i++ )
           set.add(sc.nextInt());
               

        System.out.println(set.size());

    }
}
//```