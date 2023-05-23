//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__array_distance_step2
//コメント：
//コード：
//```java

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),a=sc.nextInt()-1,b=sc.nextInt()-1;

        int[] x=new int[n];
        int[] y=new int[n];

        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();



        }
        sc.close();
        int ans=Math.abs(x[a]-x[b])+Math.abs(y[a]-y[b]);
        System.out.println(ans);
    }
}
//```