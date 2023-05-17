//言語：java
//問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__specific_format_step3
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        final int n=9;
        for (int i=0;i<n ;i++ )
        {
            for(int j=0;j<n;j++)
            {

                int num=((i+1)*(j+1));
                System.out.printf("%2d", num);
                if(j!=n-1)
                    System.out.print(" | ");
                else
                    System.out.println("");
            }
            String repeatedString = "=".repeat(9*5-3);
            if(i!=n-1)
                System.out.println(repeatedString);
        }
    }
}
//```