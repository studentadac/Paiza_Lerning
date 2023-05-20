//言語：Java
//問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__array_step3
//コメント：
//コード：
//```java

import java.util.*;
public class Main {
    public static void main(String[] args) {
        var x = new TreeSet<Integer>();//値が自動的にソートされる集合
        Scanner sc = new Scanner(System.in);
        final int n=3;
        for (int i=0;i<n ;i++ )
        {
            int num = sc.nextInt();
            x.add(num);
        }
        sc.close();
        
        System.out.println(x.last()-x.first());

    }
}
//```