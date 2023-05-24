//言語：java
//問題URL：https://paiza.jp/works/mondai/conditions_branch/conditions_branch__mod_boss
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();
        sc.close();
     
        if(n%3==0)
        {
            System.out.print("Fizz");
        }
        if(n%5==0)
        {
            System.out.print("Buzz");
        }

        if(n%3!=0&&n%5!=0)
        {System.out.print(n);}
        
        System.out.println("");
    }
}
//```