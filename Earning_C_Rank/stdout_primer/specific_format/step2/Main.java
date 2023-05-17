//言語：java
//問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__specific_format_step2
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String A = sc.next();
        String B = sc.next();
        sc.close();
        
        String C="("+A+", "+B+")";
        for(int i=0;i<n;i++)
        {
            System.out.print(C);
            if(i!=n-1)
            {
                System.out.print(", ");
            }
            else
            {
                System.out.println("");
            }
        }
    }
}
//```