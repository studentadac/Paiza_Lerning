//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__elm_rewrite
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a[]= sc.nextLine().split(" "); //a[0]=a,a[1]=b,a[2]=n;
        String s[]=sc.nextLine().split(" ");
        sc.close();
        for(String num:s )
            if(num.equals(a[0]))
            {
                System.out.println(a[1]);
            }
            else
            {
                System.out.println(num);
            }

    }
}
//```