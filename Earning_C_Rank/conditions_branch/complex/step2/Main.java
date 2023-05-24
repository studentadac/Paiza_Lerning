//言語：java
//問題URL：https://paiza.jp/works/mondai/conditions_branch/conditions_branch__complex_step2
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var a = sc.nextInt();
        var b = sc.nextInt();
        var c = sc.nextInt();

        if( a+b+c==0||a+b-c==0||a-b+c==0 ||a-b-c==0      )
            System.out.println("YES");
        else
            System.out.println("NO");



    }
}
//```