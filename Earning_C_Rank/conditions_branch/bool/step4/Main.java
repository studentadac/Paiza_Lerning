//言語：java
//問題URL：https://paiza.jp/works/mondai/conditions_branch/conditions_branch__bool_step4
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//整数Xが与えられます。Xが 10 以上ではない場合はYESを、Xが 10 以上である場合はNOを出力してください。


        int x=sc.nextInt();
        sc.close();


        if (!(x>=10))
            System.out.println("YES");

        else
            System.out.println("NO");
    }
}
//```