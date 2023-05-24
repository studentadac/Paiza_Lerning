//言語：java
//問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__div_output
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int x=3;
        final int n=sc.nextInt();

        for (int i=0;i<n ;i++ )
        {
            int a=sc.nextInt();
            if(a%x==0)
                System.out.println(a);
        }

    }
}
//```