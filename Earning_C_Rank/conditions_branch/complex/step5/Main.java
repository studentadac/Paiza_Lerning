//言語：java
//問題URL：https://paiza.jp/works/mondai/conditions_branch/conditions_branch__complex_step5
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();
        var m = sc.nextInt();
        sc.close();
        
        int cnt=0;
        while(n<m)
        {
            n*=2;
        //    System.out.println(n);
            cnt++;
        }
    

        System.out.println(cnt);

    }
}
//```