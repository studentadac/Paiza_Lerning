//言語：java
//問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__even_odd
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int x=2;
        final int n=sc.nextInt();

        for (int i=0;i<n ;i++ )
        {
            int a=sc.nextInt();
            if(a%2==0)
                System.out.println("even");
            else
                System.out.println("odd");
        }

    }
}
//```