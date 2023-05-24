//言語：java
//問題URL：https://paiza.jp/works/mondai/string_primer/advance_step4
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s  = sc.next();

        boolean isNum=true;
        for (int i=0;i<s.length() ;i++ )
        {
            if(!Character.isDigit(s.charAt(i)))
            {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
//```