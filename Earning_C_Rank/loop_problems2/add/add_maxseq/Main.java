//言語：java
//問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__add_maxseq
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int ans=0;

        for (int i=1;i<=n ;i++ )
        {
            ans=Math.max(ans,(sc.nextInt()+i));
        }

        System.out.println(ans);
    }
}
//```