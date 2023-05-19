//言語：java
//問題URL：https://paiza.jp/works/mondai/arithmetic_substitution_op/arithmetic_substitution_op__arithmetic_step6
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b  = sc.nextInt(), c =  sc.nextInt(),e= sc.nextInt();
        int d=((a+b)*c);
        d*=d;
        System.out.println(d%e);

    }
}
//```