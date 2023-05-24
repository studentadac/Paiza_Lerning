//言語：java
//問題URL：https://paiza.jp/works/mondai/conditions_branch/conditions_branch__complex_step6
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt(),k=sc.nextInt(),t=sc.nextInt();
        sc.close();
        
        if( (k*t)%n==0 )
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
//```