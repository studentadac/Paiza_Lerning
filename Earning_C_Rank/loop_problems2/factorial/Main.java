//言語：java
//問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__factorial
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        sc.close();
        int ans=1;
        while(n>=2)
        {
            ans*=n--;

        }

        System.out.println(ans);
    }
}
//```