//言語：java
//問題URL：https://paiza.jp/works/mondai/loop_problems/loop_problems__pow2

//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);


        final int n=sc.nextInt();
        sc.close();
        for (int i=1;i<=n ;i++ )
        {
            System.out.println((int)(Math.pow(2,i)));
        }

     
    }
}
//```