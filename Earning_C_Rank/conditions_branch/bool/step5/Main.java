//言語：java
//問題URL：https://paiza.jp/works/mondai/conditions_branch/conditions_branch__bool_step5
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//2 つの整数A、Bが与えられます。以下の条件を満たす場合はYESを、そうではない場合はNOを出力してください。
//・「Aが 10 以上」 かつ 「Bが 10 以上ではない」



        int a=sc.nextInt(),b=sc.nextInt();
        sc.close();


        if(a>=10&&!(b>=10))
            System.out.println("YES");

        else
            System.out.println("NO");
    }
}
//```