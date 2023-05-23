//言語：java
//問題URL：https://paiza.jp/works/mondai/logical_operation/logical_operation__basic_boss
//コメント：参考 http://tma.main.jp/logic/logic.php?type=eq&eq=%7E%28%28%7Ea%7Eb%29%2B%7Ec%29%5Ed
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

       
        int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt(),d = sc.nextInt();
        
        boolean[] x ={false,true };//x[0]ならfalse;,x[1]ならtrueをかえす;
        
        
        if(
        (!x[a]&&!x[b]&&x[d]) 
        ||( x[b]&&x[c]&&!x[d] )
        || (x[a]&&x[c]&&!x[d] ) 
        || (!x[c]&&x[d]) )                         
        System.out.println( 1 );
        else
        System.out.println(0);
        

    }
}
//```