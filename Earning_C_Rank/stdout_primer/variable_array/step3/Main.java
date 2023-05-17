//言語：java
//問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__variable_array_step2
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n=sc.nextInt();
        final int m=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print(i);

            if(i!=n)
                System.out.print(" ");
            else
                System.out.println("");

        }
        for(int i=1;i<=m;i++)
        {
            System.out.print(i);

            if(i!=m)
                System.out.print(" ");
            else
                System.out.println("");

        }
    }
}
//```