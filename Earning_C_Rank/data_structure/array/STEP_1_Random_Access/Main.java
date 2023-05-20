//言語：Java
//問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__array_step1
//コメント：
//コード：
//```java

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n=sc.nextInt();
        final int m=sc.nextInt()-1;

        int[] nums=new int[n];
        for (int i=0;i<n ;i++ )
        {
            nums[i]=sc.nextInt();
        }
        System.out.println(nums[m]);
    }
}
//```