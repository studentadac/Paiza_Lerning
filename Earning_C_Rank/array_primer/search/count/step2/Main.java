//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__search_count_step2
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {


        String s[]="1 2 5 1 4 3 2 5 1 4".split(" ");

        Scanner sc = new Scanner(System.in);
        String cmp=sc.next();
        sc.close();

        int ans=0;
        for(String num:s )
            if(num.equals(cmp))
                ans++;

        System.out.println(ans);
    }
}
//```