//言語：java
//問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__set_step1
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int n=sc.nextInt(),b=sc.nextInt();
        var set = new HashSet<Integer>();

        for (int i=0;i<n ;i++ )
        {
            set.add(sc.nextInt());
        }
        if(set.contains(b))
            System.out.println("Yes");
        else
            System.out.println("No");


    }
}
//```