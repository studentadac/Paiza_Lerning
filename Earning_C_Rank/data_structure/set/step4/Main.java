//言語：java
//問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__set_step4
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int n=sc.nextInt();
        var set = new HashSet<Integer>();

        int a=sc.nextInt();
        set.add(a);
        for (int i=1;i<n ;i++ )
        {
            int b=sc.nextInt();
            if(set.contains(b))
                System.out.println("Yes");
            else
                System.out.println("No");

            set.add(b);
        }
    }
}
//Integer 最大値 2,147,483,647
//1,000,000,000
//```