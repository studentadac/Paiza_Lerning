//言語：java
//問題URL：https://paiza.jp/works/mondai/conditions_branch/conditions_branch__complex_step3
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();
        sc.nextLine();
        
        String[] a = sc.nextLine().split(" ");
        String[] b = sc.nextLine().split(" ");
        
        int eq_cnt=0;

        for(int i=0;i<n;i++)
        {
            if(a[i].equals(b[i]))
            eq_cnt++;
        }
        
        System.out.println(eq_cnt);

    }
}
//```