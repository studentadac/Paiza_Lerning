//言語：java
//問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__div_m
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt(),m=sc.nextInt();

        int sum=0;
        while(n%m==0)
        {
            sum++;
            n/=m;
        }
        System.out.println(sum);

    }
}
//```