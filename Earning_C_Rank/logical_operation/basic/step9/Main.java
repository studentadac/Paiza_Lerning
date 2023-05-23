//言語：java
//問題URL：https://paiza.jp/works/mondai/logical_operation/logical_operation__step9
//コメント：問題文通りに解答
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);

      int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();
      int cx= a&b;
      int sy=((a ^ b) & 0b1);
      int cy=sy&c;
      int c2=cx|cy;
      int s= sy^c& 0b1;
      
      System.out.println(c2+" "+s);
      
      
      
              
    }
}
//```