//言語：Java
//問題URL：https://paiza.jp/works/mondai/query_primer/query_primer__square_division_bucket
//コメント：
//```Java

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<100 ;i++ ) 
        {
            int[] a=new int[100];
            int max=-100_000;
            for (int j=0;j<100 ;j++ ) 
            {
                a[j]=sc.nextInt();
                if(a[j]>max)
                max=a[j];
            }
            System.out.println(max);
            
        }
        
    }
}
//```