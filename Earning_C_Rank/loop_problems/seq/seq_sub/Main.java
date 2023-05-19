//言語：java
//問題URL：https://paiza.jp/works/mondai/loop_problems/loop_problems__seq_sub

//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n ;i++ ) 
       {
           a[i]=sc.nextInt();
       }
       
       int[] b=new int[n];
        for (int i=0;i<n ;i++ ) 
       {
           b[i]=sc.nextInt();
           System.out.println(a[i]-b[i]);
       }
       
    }
}
//```