//言語：java
//問題URL：https://paiza.jp/works/mondai/conditions_branch/conditions_branch__complex_boss
//コード：条件分岐面倒くさそうだから全探索で解いた後に模範解答を見たら、非常にエレガントな解法で少し後悔
//```java

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans=1000*1000;

        int a=sc.nextInt(),b=sc.nextInt();

        for(int x=a;x<=b;x++)
            for (int y=a;y<=b;y++)
                ans=Math.min(x*y,ans);

        System.out.println(ans);
    }
}
//```