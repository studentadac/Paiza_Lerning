//言語：Java
//問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__bowling
//コメント：
//コード：
//```Java

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int remaining=0,taraget=n;
        int[]a=new int[n];

        for (int i=0;i<n ;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]==1)
            {
                remaining+=a[i];
                taraget=n-i;
            }
        }
        System.out.println(taraget);
        System.out.println(remaining);
    }
}

//```