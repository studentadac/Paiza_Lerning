//言語：Java
//問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__array_step2
//コメント：
//コード：
//```java

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n=sc.nextInt();
        
        int[] nums=new int[n];
        for (int i=0;i<n ;i++ )
        {
            nums[i]=sc.nextInt();
        }

        final int q=sc.nextInt();
        int[] b=new int[q];

        for (int i=0;i<q ;i++ )
        {
            b[i]=sc.nextInt()-1;
            System.out.println(nums[b[i]]);
        }
    }
}
//```