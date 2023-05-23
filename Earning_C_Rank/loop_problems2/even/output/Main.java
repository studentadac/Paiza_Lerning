//言語：java
//問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__even_output
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n ;i++ )
        {
            int a=sc.nextInt();
            if( a%2==1)
                System.out.println(a);
        }
        sc.close();
    }
}
//```