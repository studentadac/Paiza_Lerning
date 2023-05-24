//言語：java
//問題URL：https://paiza.jp/works/mondai/conditions_branch/conditions_branch__bool_boss
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//3 つの整数X, Y, Zが与えられます。「Xが 10 以上」かつ「Yが 10 以上」の場合はYESを、そうではない場合はNOを出力してください。
//ただし、「Zが 10 以上の」場合はXとYの値にかかわらず、必ずYESを出力してください。




        int x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt();
        sc.close();


        if((x>=10&&(y>=10))||z>=10)
            System.out.println("YES");

        else
            System.out.println("NO");
    }
}
//```