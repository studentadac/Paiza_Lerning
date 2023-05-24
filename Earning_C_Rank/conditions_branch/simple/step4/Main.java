//言語：java
//問題URL：https://paiza.jp/works/mondai/conditions_branch/conditions_branch__simple_step4
//コード：
//```java
//整数 N が与えられます。Nが 0 ではない場合はYESを、 0 である場合はNOを出力してください。
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      

        int n=sc.nextInt();
        sc.close();
        if(n!=0)
        System.out.println("YES");
        else
        System.out.println("NO");

       

    }
}
//```