//言語：java
//問題URL：https://paiza.jp/works/mondai/conditions_branch/conditions_branch__complex_step4
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();
        int ans=0;

        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            if(a%2==0)
                ans+=a;
            else
                break;
        }

        System.out.println(ans);

    }
}
//```