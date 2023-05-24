//言語：java
//問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__add_minseq
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int ans=200;// Nmax+ a[i]max
        for (int i=1;i<=n ;i++ )
        {
            ans=Math.min(ans,(sc.nextInt()+i));
        }

        System.out.println(ans);
    }
}
//```