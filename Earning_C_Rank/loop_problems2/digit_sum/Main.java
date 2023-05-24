//言語：java
//問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__digit_sum
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int x=10;
        int n=sc.nextInt();

        int sum=0;
        while(n!=0)
        {
            sum+=n%x;
            n/=x;
        }
        System.out.println(sum);
    }
}
//```