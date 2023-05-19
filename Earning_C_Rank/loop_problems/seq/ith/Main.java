//言語：java
//問題URL：https://paiza.jp/works/mondai/loop_problems/loop_problems__seq_i-th

//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        final int n=sc.nextInt();
        for (int i=1;i<=n ;i++ )
        {
            if( sc.nextInt()==1)
            {
                sc.close();
                System.out.println(i);
                break;
            }
        }
    }
}
//```