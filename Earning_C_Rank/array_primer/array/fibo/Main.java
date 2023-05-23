//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__fibo
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        a[0]=0;a[1]=1;
        for(int i=2;i<n;i++)
        {
            a[i]=a[i-1]+a[i-2];
        }
        for(var num:a)
            System.out.println(num);


    }
}
//```