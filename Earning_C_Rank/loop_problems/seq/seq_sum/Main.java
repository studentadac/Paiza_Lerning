//言語：java
//問題URL：https://paiza.jp/works/mondai/loop_problems/loop_problems__seq_sum
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int n=sc.nextInt();

        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();

        int sum=0;
        for(int x:a)
        {
            sum+=x;
        }
        System.out.println(sum);
    }
}
//```