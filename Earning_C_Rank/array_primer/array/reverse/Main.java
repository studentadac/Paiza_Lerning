//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__array_reverse
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a=new int[n];

        for (int i=0;i<n ;i++ )
            a[n-i-1]=sc.nextInt();

        sc.close();
        


        for(int num:a)
            System.out.println(num);
        
    }
}
//```