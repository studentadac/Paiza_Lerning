//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__elm_count
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m=sc.nextInt();
        int[] a=new int[n];

        int ans=0;

        for (int i=0;i<n ;i++ ){
            a[i]=sc.nextInt();
            if(a[i]==m)
                ans++;
        }
        sc.close();
        System.out.println(ans);


    }
}
//```