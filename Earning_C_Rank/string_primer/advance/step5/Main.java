//言語：java
//問題URL：https://paiza.jp/works/mondai/string_primer/advance_step5
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        var S = sc.next().toCharArray();
        var set=new LinkedHashSet<Character>();

        for(var c:S   )
            set.add(c);

        for(var num :set )
            System.out.print(num);
        
        System.out.println("");

    }
}
//```