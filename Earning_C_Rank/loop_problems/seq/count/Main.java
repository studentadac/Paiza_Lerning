//言語：java
//問題URL：https://paiza.jp/works/mondai/loop_problems/loop_problems__seq_count
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        final int n=sc.nextInt();
        int cntOfOnes=0;
        for (int i=1;i<=n ;i++ )
        {
            if( sc.nextInt()==1)
            {
                cntOfOnes++;
            }
        }
        sc.close();
        System.out.println(cntOfOnes);
    }
}
//```