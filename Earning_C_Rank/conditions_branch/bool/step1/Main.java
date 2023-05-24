//言語：java
//問題URL：https://paiza.jp/works/mondai/conditions_branch/conditions_branch__bool_step1
//コード：
//```java
//整数 N が与えられます。Nが 0 ではない場合はYESを、 0 である場合はNOを出力してください。
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//2 つの整数A、Bが与えられます。AとBが両方とも 10 以上の場合はYESを、そうではない場合はNOを出力してください。

        int a=sc.nextInt(),b=sc.nextInt();
        sc.close();


        if(a>=10&&b>=10)
            System.out.println("YES");

        else
            System.out.println("NO");
    }
}
//```