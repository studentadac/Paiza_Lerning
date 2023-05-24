//言語：java
//問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__seq_one
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        for (int i=1;i<=n ;i++ )
        {
            if(sc.nextInt()==1)
                System.out.println(i);
        }
    }
}
//```