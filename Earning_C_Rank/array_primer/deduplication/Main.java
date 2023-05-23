//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__array_minmax
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        
        sc.close();
        
        Arrays.sort(a);
        
        System.out.println(a[a.length-1]+" "+a[0]);
    }
}
//```