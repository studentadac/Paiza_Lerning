//言語：java
//問題URL：https://paiza.jp/works/mondai/logical_operation/logical_operation__basic_step8
//コメント：
//コード：
//```java

import java.util.*;
public class Main {
    public static void main(String[] args) {
      var sc = new Scanner(System.in);

       
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println( (a&b) + " "+ ((a ^ b) & 0b1)   );
        

    }
}

//```