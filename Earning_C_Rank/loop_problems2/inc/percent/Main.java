//言語：java
//問題URL：https://paiza.jp/works/mondai/loop_problems2/loop_problems2__inc_percent
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int n=sc.nextInt(),m=sc.nextInt();
        int day =0;
       while(n<=m)
       {
           n*=1.1;
           day++;
       }
       System.out.println(day);
    
    }
}
//```