//言語：java
//問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__factorial_zero
//コメント：参考 https://www.shinko-keirin.co.jp/keirinkan/kou/math/jissen_arch/201603/
テストケースが100の倍数だけだから通ったのかもしれない
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n=sc.nextInt();
        //    System.out.println(n);
        int sum=0;
        int a=0,b=0,c=0;
        for (int i=5;i<=n ;i*=5 )
        {
            sum+=n/i;
        }
        System.out.println(sum);
    }
}
//```